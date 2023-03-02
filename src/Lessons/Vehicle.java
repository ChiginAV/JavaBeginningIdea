package Lessons;

public class Vehicle {

    private int passengers;
    private int fuelCap;
    private int mpg;

    Vehicle(int passengers, int fuelCap, int mpg){
        this.passengers = passengers;
        this.fuelCap    = fuelCap;
        this.mpg        = mpg;
    }

    int getPassengers(){ return passengers; }
    int getFuelCap(){ return fuelCap; }
    int getMpg(){ return mpg; }

    void setPassengers(int passengers){ this.passengers = passengers; }
    void setFuelCap(int fuelCap){ this.fuelCap = fuelCap; }
    void setMpg(int mpg){ this.mpg = mpg; }

    public int range(){
        return (fuelCap * mpg);
    }

    public double fuelNeeded(int miles){
        return (double) miles / mpg;
    }

}
