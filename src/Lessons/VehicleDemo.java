package Lessons;

public class VehicleDemo {

    public static void executeMe(){

        /*
        int dist = 252;

        Vehicle minivan   = new Vehicle(7, 16, 21);
        Vehicle sportCar = new Vehicle(2, 14, 12);

        System.out.println("Minivan can get " + minivan.getPassengers() + " passengers on " + minivan.range() + " miles");
        System.out.println("For " + dist + " miles minivan needs " + minivan.fuelNeeded(dist) + " gallons of gas");
        System.out.println();
        System.out.println("SportCar can get " + sportCar.getPassengers() + " passengers on " + sportCar.range() + " miles");
        System.out.println("For " + dist + " miles sportCar needs " + sportCar.fuelNeeded(dist) + " gallons of gas");
        */

        VehicleTruck semi   = new VehicleTruck(2,200,7,44000); // Semi truck - тягач с полуприцепом (шарнирно-сочленённой рамой)
        VehicleTruck pickup = new VehicleTruck(3,28,15,2000);

        int dist = 252;

        System.out.println("Semi can get " + semi.getCargoCap() + " pounds");
        System.out.println("For " + dist + " miles semi needs " + semi.fuelNeeded(dist) + " gallons of gas");
        System.out.println();

        System.out.println("Pickup can get " + pickup.getCargoCap() + " pounds");
        System.out.println("For " + dist + " miles pickup needs " + pickup.fuelNeeded(dist) + " gallons of gas");
        System.out.println();


    }

}
