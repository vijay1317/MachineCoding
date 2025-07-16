package parkinglot.parkingfee;

public interface ParkingFeeStrategy {

    double calculateFee(String vehicleType,int duration);
}
