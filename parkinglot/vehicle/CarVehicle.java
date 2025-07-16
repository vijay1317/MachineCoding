package parkinglot.vehicle;

import parkinglot.parkingfee.ParkingFeeStrategy;

public class CarVehicle extends Vehicle{

    public CarVehicle(String numberPlate, ParkingFeeStrategy feeStrategy){
        super(numberPlate,"Car",feeStrategy);
    }
}
