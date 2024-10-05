package Methods_Exercise;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //входни данни
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        //(firstNumber + secondNumber) - thirdNumber
        int sum = sum(firstNumber, secondNumber); //сумираме първите 2 числа
        int diff = subtract(sum, thirdNumber); //изваждаме от сумата на първите две числа третото

        System.out.println(diff);

    }

    //метод, който сумира две цели числа и връща резултатът
    public static int sum (int n1, int n2) {
        return n1 + n2;
    }

    //метод, който изважда две цели числа и връща резултатът
    public static int subtract (int n1, int n2) {
        return n1 - n2;
    }
}
