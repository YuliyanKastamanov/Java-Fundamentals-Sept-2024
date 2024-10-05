package Methods_Exercise;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. входни данни
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        //2. намери факториела на първото число
        long factorialFirstNumber = calculateFactorial(firstNumber);

        //3. намери факториела на второто число
        long factorialSecondNumber = calculateFactorial(secondNumber);

        //4. факториел на първото число / факториел на второто число -> %.2f
        double result = factorialFirstNumber * 1.0 / factorialSecondNumber;
        System.out.printf("%.2f", result);

    }

    //метод, който намира и връща стойността на факториела на дадено число
    //!!! изчисления факториел може да бъде много голямо цяло число !!!
    public static long calculateFactorial (int number) {
        //number = 8
        //8! = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8
        long fact = 1; //стойността на факториел
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        //знаем факториела на числото
        return fact;
    }
}
