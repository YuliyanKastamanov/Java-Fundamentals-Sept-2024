package ObjectAndCassesExercise.VehicleCatalogue_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstCommand = scanner.nextLine();

        List<Vehicle> vehicleCatalogue = new ArrayList<>();
        int sumCarsHp = 0;
        int countCars = 0;

        int sumTrucksHp = 0;
        int countTrucks = 0;

        while (!firstCommand.equals("End")){

            //"{typeOfVehicle} {model} {color} {horsepower}"
            //car Ferrari red 550
            String [] vehicleData = firstCommand.split("\\s+");//["car", "Ferrari", "red", "550"]
            String type = vehicleData[0];//"car"
            String model = vehicleData[1];//"Ferrari"
            String color = vehicleData[2];//"red"
            int horsePower = Integer.parseInt(vehicleData[3]);//550

            Vehicle currentVehicle = new Vehicle(type, model, color, horsePower);
            vehicleCatalogue.add(currentVehicle);

            switch (type){
                case "car" -> {
                    countCars++;
                    sumCarsHp += horsePower;
                }
                case "truck" -> {
                    countTrucks++;
                    sumTrucksHp += horsePower;
                }
            }

            firstCommand = scanner.nextLine();
        }

        String secondCommand = scanner.nextLine();

        while (!secondCommand.equals("Close the Catalogue")){

            String finalSecondCommand = secondCommand;
            List<Vehicle> currentVehicle = vehicleCatalogue.stream()
                    .filter(vehicle -> vehicle.getModel().equals(finalSecondCommand)).collect(Collectors.toList());

            if(currentVehicle.getFirst().getType().equals("car")){
                System.out.println("Type: Car");
                System.out.println("Model: " + currentVehicle.getFirst().getModel());
                System.out.println("Color: " + currentVehicle.getFirst().getColor());
                System.out.println("Horsepower: " + currentVehicle.getFirst().getHorsePower());
            }else if(currentVehicle.getFirst().getType().equals("truck")){
                System.out.println("Type: Truck");
                System.out.println("Model: " + currentVehicle.getFirst().getModel());
                System.out.println("Color: " + currentVehicle.getFirst().getColor());
                System.out.println("Horsepower: " + currentVehicle.getFirst().getHorsePower());
            }


            secondCommand = scanner.nextLine();
        }

        double avgCarHp = 0;
        double avgTruckHp = 0;

        if(sumCarsHp != 0){
            avgCarHp = sumCarsHp * 1.0 / countCars;
        }

        if (sumTrucksHp != 0) {
            avgTruckHp = sumTrucksHp * 1.0 / countTrucks;
        }


        System.out.printf("Cars have average horsepower of: %.2f.%n", avgCarHp );
        System.out.printf("Trucks have average horsepower of: %.2f.",avgTruckHp );
    }
}
