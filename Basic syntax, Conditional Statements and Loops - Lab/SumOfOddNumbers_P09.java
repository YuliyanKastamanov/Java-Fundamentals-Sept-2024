package BasicSyntaxConditionalStatementsAndLoops_W01.Labs;

import java.util.Scanner;

public class SumOfOddNumbers_P09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int countOddNumbers = Integer.parseInt(scanner.nextLine());


        int currentNumber = 1;
        int sumOddNumber = 0;

        for (int i = 1; i <= countOddNumbers; i++) {

            System.out.println(currentNumber);
            sumOddNumber += currentNumber;
            currentNumber += 2;

            
        }

        System.out.printf("Sum: %d", sumOddNumber);
    }
}
