package BasicSyntaxConditionalStatementsAndLoops_W01.Labs;

import java.util.Scanner;

public class EvenNumber_P11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        while (number % 2 != 0){

            System.out.println("Please write an even number.");
            number = Integer.parseInt(scanner.nextLine());
        }


        System.out.printf("The number is: %d", Math.abs(number));

    }
}
