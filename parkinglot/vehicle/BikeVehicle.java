package parkinglot.vehicle;

import parkinglot.parkingfee.ParkingFeeStrategy;

public class BikeVehicle extends Vehicle{
    public BikeVehicle(String numberPlate, ParkingFeeStrategy feeStrategy){
        super(numberPlate,"Bike",feeStrategy);
    }
}

