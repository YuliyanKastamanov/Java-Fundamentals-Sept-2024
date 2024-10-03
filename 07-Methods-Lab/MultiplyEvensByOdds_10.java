package Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int multipliedResult = getMultiplyOfEvensAdnOddsSum(Math.abs(number));

        System.out.println(multipliedResult);
    }

    private static int getMultiplyOfEvensAdnOddsSum(int number) {

        int evenSum = getSumOfEvenDigits(number);
        int oddSum = getSumOfOddDigits(number);
        return evenSum * oddSum;
    }

    private static int getSumOfOddDigits(int number) {

        int oddSum = 0;

        //todo

        return oddSum;
    }

    private static int getSumOfEvenDigits(int number) {

        int evenSum = 0;

        //todo

        return evenSum;
    }
}
