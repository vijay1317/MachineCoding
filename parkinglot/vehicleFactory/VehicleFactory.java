package parkinglot.vehicleFactory;

import parkinglot.parkingfee.ParkingFeeStrategy;
import parkinglot.vehicle.BikeVehicle;
import parkinglot.vehicle.CarVehicle;
import parkinglot.vehicle.Vehicle;

public class VehicleFactory {
    public static  Vehicle createVehicle(String vehicleType, String numberPlate, ParkingFeeStrategy feeStrategy){
        switch (vehicleType.toLowerCase()){
            case "car":
                return new CarVehicle(numberPlate,feeStrategy);
            case "Bike":
                return new BikeVehicle(numberPlate,feeStrategy);
            default:
                return null;
        }
    }
}
