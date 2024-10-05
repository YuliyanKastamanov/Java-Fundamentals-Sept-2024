package Methods_Exercise;

import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); //брой редове = брой колони

        printMatrix(n);

    }

    //метод, който отпечатва таблица с n реда и n колони
    private static void printMatrix(int n) {
        for (int row = 1; row <= n; row++) { //всички редове
            for (int col = 1; col <= n; col++) { //всички колони
                System.out.print(n + " ");
            }
            System.out.println();
            //свали курсора на нов ред, за може следващото нещо, което ще отпечатваме да е на нов ред
        }
    }

}
