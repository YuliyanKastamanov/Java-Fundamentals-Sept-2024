package BasicSyntaxConditionalStatementsAndLoops_W01.Labs;

import java.util.Scanner;

public class StudentInformation_P01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();

        int age = Integer.parseInt(scanner.nextLine());

        double averageGrade = Double.parseDouble(scanner.nextLine());

        System.out.printf("Name: %s Age: %d Grade: %.2f", studentName, age, averageGrade);

    }
}
