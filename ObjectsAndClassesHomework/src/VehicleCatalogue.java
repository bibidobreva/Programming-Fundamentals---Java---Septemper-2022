import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {

    static class Vehicle {
        private String type;
        private String model;
        private String color;
        private double horsePower;


        public Vehicle(String type, String model, String color, double horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getModel() {
            return this.model;
        }

        public double getHorsePower() {
            return this.horsePower;
        }

        public String getType() {
            return this.type;
        }

        public String toString() {
            return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %.0f",
                    getType().substring(0,1).toUpperCase()+getType().substring(1), this.model, this.color, this.horsePower);
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicles = new ArrayList<>();

        String input;
        while (!(input = scanner.nextLine()).equals("End")) {
            String[] characteristics = input.split("\\s+");

            Vehicle current = new Vehicle(characteristics[0], characteristics[1], characteristics[2], Double.parseDouble(characteristics[3]));
            vehicles.add(current);

        }

        String model;
        while (!(model = scanner.nextLine()).equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getModel().equals(model)) {
                    System.out.println(vehicle.toString());
                }
            }
        }

        //"{typeOfVehicles} have average horsepower of {averageHorsepower}."
        double carSum = 0;
        double carCount = 0;
        double truckSum = 0;
        double truckCount = 0;
        for (int i = 0; i < vehicles.size(); i++) {

            if (vehicles.get(i).getType().equals("car")) {
                carSum += vehicles.get(i).getHorsePower();
                carCount++;
            } else {
                truckSum += vehicles.get(i).getHorsePower();
                truckCount++;
            }
        }


        double carAverage = carSum / carCount;
        double truckAverage = truckSum / truckCount;

        if (carCount <= 0 || carSum <= 0) {
            carAverage = 0;
        }
        if(truckCount<=0||truckSum<=0){
            truckAverage=0;
        }


        System.out.printf("Cars have average horsepower of: %.2f.%n", carAverage);
        System.out.printf("Trucks have average horsepower of: %.2f.", truckAverage);
    }
}
