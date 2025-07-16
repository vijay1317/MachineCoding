package parkinglot.vehicle;

import parkinglot.parkingfee.ParkingFeeStrategy;

public abstract class Vehicle {
    private String numberPlat;
    private String vehicleType;
    private ParkingFeeStrategy parkingFeeStrategy;

    public Vehicle(String numberPlate,String vehicleType,ParkingFeeStrategy parkingFeeStrategy){
        this.numberPlat =numberPlate;
        this.vehicleType =vehicleType;
        this.parkingFeeStrategy =  parkingFeeStrategy;
    }
    public String getNumberPlat(){
        return this.numberPlat;
    }
    public String getVehicleType(){
        return this.vehicleType;
    }

    public double calculateFee(int duration){
        return parkingFeeStrategy.calculateFee(this.vehicleType,duration);
    }

}

