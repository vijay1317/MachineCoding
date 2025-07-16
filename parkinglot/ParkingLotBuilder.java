package parkinglot;

import parkinglot.parkingspot.BikeParkingSpot;
import parkinglot.parkingspot.CarParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotBuilder {
    // List of floors to be added to the parking lot
    private List<ParkingFloor> floors;
    // Constructor initializes the list of floors.
    public ParkingLotBuilder() {
        this.floors = new ArrayList<>();
    }
    // Adds a pre-configured parking floor to the parking lot.
    public ParkingLotBuilder addFloor(ParkingFloor floor) {
        floors.add(floor);
        return this;
    }
    // Creates a floor with specified numbers of different vehicle parking spots.
    public ParkingLotBuilder createFloor(int floorNumber, int numOfCarSpots, int numOfBikeSpots) {
        // Create a new parking floor
        ParkingFloor floor = new ParkingFloor(floorNumber);
        // Add car spots
        for (int i = 0; i < numOfCarSpots; i++) {
            floor.addParkingSpot(new CarParkingSpot(i + 1));
        }
        // Add bike spots
        for (int i = 0; i < numOfBikeSpots; i++) {
            floor.addParkingSpot(new BikeParkingSpot(numOfCarSpots + i + 1));
        }
        // Add other types of spots if provided
        int spotOffset = numOfCarSpots + numOfBikeSpots;

        // Add the configured floor to the list of floors
        floors.add(floor);
        return this;
    }
    // Builds and returns the fully configured parking lot.
    public ParkingLot build() {
        return new ParkingLot(floors);
    }
}