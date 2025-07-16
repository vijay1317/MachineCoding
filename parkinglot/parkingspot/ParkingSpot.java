package parkinglot.parkingspot;

import parkinglot.vehicle.Vehicle;

public abstract class ParkingSpot {
    private int spotNumber;
    private boolean isOccupied;
    private Vehicle vehicle;
    private String spotType;

    public ParkingSpot(int spotNumber,String SpotType){
        this.spotNumber = spotNumber;
        this.spotType =SpotType;
        this.isOccupied =false;
    }

    public boolean isOccupied(){
        return this.isOccupied;
    }

    public abstract boolean canParkVehicle(Vehicle vehicle);

    public void parkVehicle(Vehicle vehicle){
        if(isOccupied){
            System.out.println("already occupied");
            return;
        }
        if(!canParkVehicle(vehicle)){
            System.out.println("This spot is not suitable for: "+vehicle.getVehicleType());
            return;
        }
        this.vehicle = vehicle;
        this.isOccupied =true;
    }


    public void vacate(){
        if(!isOccupied){
            System.out.println("already vacant");
        }

        this.vehicle =null;
        this.isOccupied =false;

    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    // Getter for spot type
    public String getSpotType() {
        return spotType;
    }
    public int getSpotTNumber() {
        return spotNumber;
    }


}
