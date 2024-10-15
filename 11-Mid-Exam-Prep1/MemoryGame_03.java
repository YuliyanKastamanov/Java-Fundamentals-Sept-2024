package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listOfElements = Arrays.stream(scanner.nextLine().split(" "))
                        .collect(Collectors.toList());

        String command = scanner.nextLine();

        int countMoves = 0;
        

        while (!command.equals("end")){

            int firstIndex = Integer.parseInt(command.split(" ")[0]);
            int secondIndex = Integer.parseInt(command.split(" ")[1]);
            countMoves++;

            boolean areValidIndexes = firstIndex >=0 && firstIndex < listOfElements.size() &&
                    secondIndex >= 0 && secondIndex < listOfElements.size();

            if(firstIndex == secondIndex || !areValidIndexes){
                String elementToAdd = "-" + countMoves + "a";
                int indexToAdd = listOfElements.size() / 2;
                listOfElements.add(indexToAdd, elementToAdd);
                listOfElements.add(indexToAdd, elementToAdd);
                System.out.println("Invalid input! Adding additional elements to the board");
                command = scanner.nextLine();
                continue;
            }

            String firstElement = listOfElements.get(firstIndex);
            String secondElement = listOfElements.get(secondIndex);

            if (firstElement.equals(secondElement)) {

                listOfElements.remove(firstElement);
                listOfElements.remove(secondElement);
                System.out.printf("Congrats! You have found matching elements - %s!%n", firstElement);

            }else {
                System.out.println("Try again!");
            }

            if(listOfElements.isEmpty()){
                System.out.printf("You have won in %d turns!", countMoves);
                return;
            }
            command = scanner.nextLine();
        }

        if(!listOfElements.isEmpty()){
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ", listOfElements));
        }




    }
}
