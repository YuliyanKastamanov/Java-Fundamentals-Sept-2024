package DataTypesAndVariables;

import java.util.Scanner;

public class PoundsToDollars_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        float pounds = Float.parseFloat(scanner.nextLine());

        float dollars = pounds * 1.36f;

        System.out.printf("%.3f", dollars);

    }
}
