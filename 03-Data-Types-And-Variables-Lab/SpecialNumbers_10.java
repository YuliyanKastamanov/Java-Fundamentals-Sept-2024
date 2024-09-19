package DataTypesAndVariables;

import java.util.Scanner;

public class SpecialNumbers_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number ; i++) {

            int digits = i;
            int sumDigits = 0;

            while (digits > 0) {

                sumDigits += digits % 10;
                digits = digits / 10;
            }

            if (sumDigits == 5 || sumDigits == 7 || sumDigits == 11){
                System.out.printf("%d -> True%n", i);
            }else {
                System.out.printf("%d -> False%n", i);
            }



        }
    }
}
