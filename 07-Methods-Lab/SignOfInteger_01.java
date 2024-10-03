package Methods;

import java.util.Scanner;

public class SignOfInteger_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());


        printSign(number);


    }

    private static void printSign(int currentNumber){

        if(currentNumber > 0){
            System.out.printf("The number %d is positive.", currentNumber);
        } else if ( currentNumber < 0) {
            System.out.printf("The number %d is negative.", currentNumber);
        }else {
            System.out.printf("The number %d is zero.", currentNumber);
        }

    }
}
