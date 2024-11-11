import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNumber = new BigInteger(scanner.nextLine()); //много голямо число
        BigInteger secondNumber = new BigInteger(scanner.nextLine()); //цифра

        System.out.println(firstNumber.multiply(secondNumber)); //умножение
        //System.out.println(firstNumber.add(secondNumber)); //събиране
        //System.out.println(firstNumber.subtract(secondNumber)); //извваждане
        //System.out.println(firstNumber.divide(secondNumber)); //деление

    }
}
