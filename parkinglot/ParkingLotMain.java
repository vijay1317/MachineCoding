package parkinglot;

import parkinglot.parkingfee.BasicRateStrategy;
import parkinglot.parkingfee.ParkingFeeStrategy;
import parkinglot.parkingfee.PremiumRateStrategy;
import parkinglot.parkingspot.BikeParkingSpot;
import parkinglot.parkingspot.CarParkingSpot;
import parkinglot.parkingspot.ParkingSpot;
import parkinglot.payment.CashPaymentStrategy;
import parkinglot.payment.CreditCardPaymentStrategy;
import parkinglot.payment.Payment;
import parkinglot.vehicle.Vehicle;
import parkinglot.vehicleFactory.VehicleFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkingLotMain {
    public static void main(String[] args) {
        // Initialize parking spots
        ParkingLot parkingLot =
                new ParkingLotBuilder()
                        // First floor: 2 car spots, 2 bike spots
                        .createFloor(1, 2,2)
                        // Second floor: 3 car spots, 1 bike spot, 1 other vehicle spot
                        .createFloor(2, 3,2)
                        .build();
        // Initialize parking lot
        // Create fee strategies
        ParkingFeeStrategy basicHourlyRateStrategy = new BasicRateStrategy();
        ParkingFeeStrategy premiumRateStrategy = new PremiumRateStrategy();
        // Create vehicles using Factory Pattern with fee strategies
        Vehicle car1 = VehicleFactory.createVehicle("Car","1234",basicHourlyRateStrategy);
        Vehicle bike1 = VehicleFactory.createVehicle("Bike","123Bike4",basicHourlyRateStrategy);// Park vehicles

        ParkingSpot carSpot = parkingLot.parkVehicle(car1);
        ParkingSpot bikeSpot = parkingLot.parkVehicle(bike1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select payment method for your vehicle:");

        System.out.println("1. Credit Card");
        System.out.println("2. Cash");

        int paymentMethod = scanner.nextInt();
        // Process payments using Strategy Patterns
        if (carSpot != null) {
            // Calculate fee using the specific strategy for the vehicle
            double carFee = car1.calculateFee(2);

            Payment payment =  new Payment(carFee,new CashPaymentStrategy());
            payment.processPayment();

            parkingLot.vacateSpot(carSpot, car1);
        }
        if (bikeSpot != null) {
            // Calculate fee using the specific strategy for the vehicle
            double bikeFee = bike1.calculateFee(3);
            Payment payment = new Payment(bikeFee,new CreditCardPaymentStrategy());
            payment.processPayment();

            parkingLot.vacateSpot(bikeSpot, bike1);
        }
        scanner.close();
    }

}
