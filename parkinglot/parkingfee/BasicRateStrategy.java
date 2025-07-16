package parkinglot.parkingfee;

public class BasicRateStrategy implements ParkingFeeStrategy {
    @Override
    public double calculateFee(String vehicleType, int duration) {
        switch (vehicleType.toLowerCase()){
            case "car":
                return duration * 30;
            case "bike":
                return duration*20;
            default:
                return duration*10 ;


        }

    }
}
