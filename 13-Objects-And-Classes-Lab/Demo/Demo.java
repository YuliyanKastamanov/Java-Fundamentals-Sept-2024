import java.math.BigInteger;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Math.PI);

        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        int secondNumber = 45;

        firstNumber.add(new BigInteger(secondNumber + ""));

    }
}
