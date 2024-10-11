package List_Exercises;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());


/* •Add {number} - add number at the end
•	Insert {number} {index} - insert number at given index
•	Remove {index} - remove that index
•	Shift left {count} - first number becomes last 'count' times
•	Shift right {count} - last number becomes first 'count' times*/

        String command = scanner.nextLine();

        while (!command.equals("End")){
            String [] commandData = command.split("\\s+");
            String commandName = commandData [0]; //"Add"

            switch (commandName){
                case "Add" -> {
                    int numberToAdd = Integer.parseInt(commandData[1]); // 5
                    numbers.add(numberToAdd);
                }
                case "Insert" -> {
                    //Insert  3 0 -> добавяме числото 3 на индекс 0
                    int numberToInsert = Integer.parseInt(commandData[1]);
                    int index = Integer.parseInt(commandData[2]);

                    boolean isValidIndex = checkIfIndexIsValid(index, numbers.size() - 1);
                            //index >= 0 && index <= numbers.size() - 1

                    if(isValidIndex){
                        numbers.add(index, numberToInsert);
                    }else {
                        System.out.println("Invalid index");
                    }

                }

                case "Remove" -> {
                    //Remove {index}

                    int indexToRemove = Integer.parseInt(commandData[1]);
                    boolean isValidIndex = checkIfIndexIsValid(indexToRemove, numbers.size() - 1);

                    if(isValidIndex){
                        numbers.remove(indexToRemove);
                    }else {
                        System.out.println("Invalid index");
                    }
                }

                case "Shift" ->{

                    //1. Shift left {count}
                    //2. Shift right {count}

                    String shiftType = commandData[1];
                    int count = Integer.parseInt(commandData[2]);

                    if(shiftType.equals("left")){
                        shiftLeft(numbers, count);
                    }else if(shiftType.equals("right")){

                        shiftRight(numbers, count);
                    }
                }
            }





            command = scanner.nextLine();
        }

        for (int number : numbers){
            System.out.print(number + " ");
        }

    }

    private static void shiftLeft(List<Integer> numbers, int count){
        for (int i = 1; i <= count ; i++) {

            //{12, 10, 4, 23}
            //count = 2
            //вземаме 1-вия елемент
            int firstElement = numbers.getFirst();
            numbers.add(firstElement); //1. {12, 10, 4, 23, 12} -> 2. {10, 4, 23, 12, 10}
            numbers.remove(0);//1. {10, 4, 23, 12} -> 2. {4, 23, 12, 10}

        }
    }


    private static void shiftRight(List<Integer> numbers, int count){
        for (int i = 1; i <= count ; i++) {

            //{12, 10, 4, 23}
            //count = 2
            //вземаме последния елемент
            int lastElement = numbers.getLast();
            numbers.add(0, lastElement); //1. {23, 12, 10, 4, 23} -> 2. {4, 23, 12, 10, 4}
            numbers.remove(numbers.size() - 1);//1. {23, 12, 10, 4}-> 2.  {4, 23, 12, 10}

        }
    }

    private static boolean checkIfIndexIsValid(int index, int lastIndex) {

        return index >= 0 && index <= lastIndex;
    }


}
