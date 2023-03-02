package Lessons;

public class VehicleTruck extends Vehicle {

    private int cargoCap;

    VehicleTruck(int passengers, int fuelCap, int mpg, int cargoCap){
        super(passengers, fuelCap, mpg);

        this.cargoCap = cargoCap;
    }

    int getCargoCap(){ return cargoCap; }
    void setCargoCap(int cargoCap){ this.cargoCap = cargoCap; }

}
