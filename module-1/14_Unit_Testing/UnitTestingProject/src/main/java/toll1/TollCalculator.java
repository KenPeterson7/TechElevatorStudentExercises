package toll1;

import java.util.ArrayList;
import java.util.List;

public class TollCalculator {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car(false));
        vehicles.add(new Car(true));
        vehicles.add(new Tank());
        vehicles.add(new Truck(4));
        vehicles.add(new Truck(6));
        vehicles.add(new Truck(8));

        int distance = 10 + (int)(Math.random() * 231);

        List<String> vehicleNames = new ArrayList<>();
        vehicleNames.add("Car");
        vehicleNames.add("Car with trailer") ;
        vehicleNames.add("Tank");
        vehicleNames.add("Truck 4 axles");
        vehicleNames.add("Truck 6 axles");
        vehicleNames.add("Truck 8 axles");

        double totalCost = 0.0;

        for (int i = 0; i < vehicles.size(); i++) {
            System.out.print("Vehicle: " + vehicleNames.get(i) + "   Distance: " + distance + "   Toll: $");
            totalCost += vehicles.get(i).calculateToll(distance);
            System.out.printf("%.2f", vehicles.get(i).calculateToll(distance));
            System.out.println("");
        }

        System.out.println("Total Miles Traveled: " + distance * vehicles.size());
        System.out.print("Total Tollbooth Revenue: $");
        System.out.printf("%.2f", totalCost);
    }
}
