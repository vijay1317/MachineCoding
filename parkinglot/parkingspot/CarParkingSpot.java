package parkinglot.parkingspot;

import parkinglot.vehicle.Vehicle;

public class CarParkingSpot extends ParkingSpot{

    public CarParkingSpot(int spotNumber){
        super(spotNumber,"Car");
    }
    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return vehicle.getVehicleType().equals("Car");
    }
}