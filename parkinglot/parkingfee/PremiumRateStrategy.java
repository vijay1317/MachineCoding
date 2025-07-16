package parkinglot.parkingfee;

public class PremiumRateStrategy implements ParkingFeeStrategy {
    @Override
    public double calculateFee(String vehicleType, int duration) {
        switch (vehicleType.toLowerCase()){

            case "car":
                return duration *25;
            case "bike":
                return duration * 15;
            default:
                return duration * 10;
        }
    }
}
