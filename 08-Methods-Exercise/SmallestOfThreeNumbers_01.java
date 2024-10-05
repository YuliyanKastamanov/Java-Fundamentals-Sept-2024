package Methods_Exercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //входни данни
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(getSmallestNumber(firstNumber, secondNumber, thirdNumber));
    }

    //метод, който връща най-малкото от три числа
    //при създаване на метод: {public / private} static {void / } {име на метода} ({параметри})
    private static int getSmallestNumber (int n1, int n2, int n3) {
         return Math.min(Math.min(n1, n2), n3);
    }
}
