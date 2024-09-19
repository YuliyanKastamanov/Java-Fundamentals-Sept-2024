package BasicsRecap;

import java.util.Scanner;

public class TriangleOfNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни
        int n = Integer.parseInt(scanner.nextLine());

        //n == брой редове, които трябва да отпечатаме

        for (int row = 1; row <= n; row++) { //обхожда всички редове
            //повтаряме: отпечатваме данни
            for (int count = 1; count <= row; count++) { //колко пъти отпечатвам номера на реда
                System.out.print(row + " ");
            }
            //преди преминаването на следващия ред -> сваляме курсора
            System.out.println();
        }
    }
}
