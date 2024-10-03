package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        String result = new DecimalFormat("0.####").format(mathPower(number, power));
        System.out.println(result);
    }

    private static double mathPower(double number, int power) {

      return Math.pow(number, power);


    }
}
