package Methods;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        printHello();

        int[] array = {1, 2, 3, 4};

        printArray(array);

        String  result = getResult(10.50, 20.10);

        int oddSum = 0;

        int number = 12345;
        while (number > 0){
            int digit = number % 10;

            if(digit % 2 == 0){
                oddSum += digit;
            }

            number = number / 10;
        }

    }

    private static String  getResult(double number1, double number2) {

        double currentResult = number1 + number2;

        String result = String.format("The result is: %f", currentResult);

        return result;

    }



    private static void printHello(){

        System.out.println("Hello!");
    }

    private static void printArray(int[] args){
        for (int currentNum : args){
            System.out.println(currentNum);
        }
    }



}
