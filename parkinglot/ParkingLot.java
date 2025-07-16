package parkinglot;

import parkinglot.parkingspot.ParkingSpot;
import parkinglot.vehicle.Vehicle;

import java.util.List;


public class ParkingLot {
//    private List<ParkingSpot> parkingSpots;
    private List<ParkingFloor> floors;

    // Constructor to initialize the parking lot with parking spots

    public ParkingLot(List<ParkingFloor> floors) {
        this.floors = floors;
    }
    // Method to find an available spot based on vehicle type
    public ParkingSpot findAvailableSpot(String vehicleType) {
        for (ParkingFloor floor : floors) {
            ParkingSpot spot = floor.findAvailableSpot(vehicleType);
            if (spot != null) {
                return spot; // Return the first available spot found
            }
        }
        return null; // Return null if no spot is available
    }
    // Method to park a vehicle
    public ParkingSpot parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = findAvailableSpot(vehicle.getVehicleType());
        if (spot != null) {
            spot.parkVehicle(vehicle); // Mark the spot as occupied
            System.out.println(
                    "Vehicle parked successfully in spot: " + spot.getSpotTNumber());
            return spot;
        }
        System.out.println(
                "No parking spots available for " + vehicle.getVehicleType() + "!");
        return null;
    }
    // Method to vacate a parking spot
    public void vacateSpot(ParkingSpot spot, Vehicle vehicle) {
        if (spot != null && spot.isOccupied()
                && spot.getVehicle().equals(vehicle)) {
            spot.vacate(); // Free the spot
            System.out.println(vehicle.getVehicleType()
                    + " vacated the spot: " + spot.getSpotTNumber());
        } else {
            System.out.println("Invalid operation! Either the spot is already vacant "
                    + "or the vehicle does not match.");
        }
    }
    // Method to find a spot by its number
    public ParkingSpot getSpotByNumber(int spotNumber) {
        for (ParkingFloor floor : floors) {
            for (ParkingSpot spot : floor.getParkingSpots()) {
                if (spot.getSpotTNumber() == spotNumber) {
                    return spot; // Return the parking spot if found
                }
            }
        }
        return null; // Return null if no spot with the given number exists
    }
    // Getter for parking spots
    public List<ParkingFloor> getFloors() {
        return floors;
    }
}
