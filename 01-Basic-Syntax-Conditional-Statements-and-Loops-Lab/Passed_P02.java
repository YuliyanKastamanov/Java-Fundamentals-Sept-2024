package BasicSyntaxConditionalStatementsAndLoops_W01.Labs;

import java.util.Scanner;

public class Passed_P02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        //проверяваме дали оценката е по-голяма или равна на 3
        if (grade >= 3){
            System.out.println("Passed!");
        }
    }
}
