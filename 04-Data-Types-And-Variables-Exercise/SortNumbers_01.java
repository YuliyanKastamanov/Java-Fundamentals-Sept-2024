package DataTypesAndVariables;

import java.util.Scanner;

public class SortNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int maxNumber = Math.max(Math.max(firstNumber, secondNumber), thirdNumber);
        int minNumber = Math.min(Math.min(firstNumber, secondNumber), thirdNumber);

        //maxNumber
        System.out.println(maxNumber);


        //midNumber
        if (maxNumber == firstNumber) {
            if (minNumber == secondNumber) {
                //средното е thirdNumber
                System.out.println(thirdNumber);
            } else if (minNumber == thirdNumber) {
                //средното е thirdNumber
                System.out.println(secondNumber);
            }
        } else if (maxNumber == secondNumber) {
            if (minNumber == firstNumber) {
                //средното е thirdNumber
                System.out.println(thirdNumber);
            } else if (minNumber == thirdNumber) {
                //средното е firstNumber
                System.out.println(firstNumber);
            }
        } else if (maxNumber == thirdNumber) {
            if (minNumber == firstNumber) {
                //средното е secondNumber
                System.out.println(secondNumber);
            } else if (minNumber == secondNumber) {
                //средното е firstNumber
                System.out.println(firstNumber);
            }
        }

        //minNumber
        System.out.println(minNumber);
    }
}
