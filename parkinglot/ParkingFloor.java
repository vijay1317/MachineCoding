package parkinglot;

import parkinglot.parkingspot.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private List<ParkingSpot> spots;
    private int floorNumber;

    public ParkingFloor(int number){
        this.floorNumber = number;
        this.spots = new ArrayList<>();
    }

    public void addParkingSpot(ParkingSpot spot){
        this.spots.add(spot);
    }

    public ParkingSpot findAvailableSpot(String vehicleType){
        for(ParkingSpot spot:spots){
            if(!spot.isOccupied() && spot.getVehicle().getVehicleType().equals(vehicleType)){
                return spot;
            }
        }

        return null;
    }

    public List<ParkingSpot> getParkingSpots(){
        return spots;
    }

    public int getFloorNumber(){
        return this.floorNumber;
    }


}
