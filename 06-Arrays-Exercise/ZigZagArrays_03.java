package Arrays_Exercise;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countRows = Integer.parseInt(scanner.nextLine()); //брой редове с числа, които се въвеждат

        int[] firstArray = new int[countRows];
        int[] secondArray = new int[countRows];

        for (int row = 1; row <= countRows; row++) {
            String input = scanner.nextLine(); //"3 4".split(" ") -> ["3", "4"]
            int firstNumber = Integer.parseInt(input.split(" ")[0]);
            int secondNumber = Integer.parseInt(input.split(" ")[1]);

            if (row % 2 == 0) { //втори, четвърти, шести, ...
                //четен ред: първото число отива във втория масив; второто число отива в първия масив
                secondArray[row - 1] = firstNumber;
                firstArray[row - 1] = secondNumber;
            } else { //първи, трети, пети, ....
                //нечетен ред: първото число отива в първия масив; второто число отива във втория масив
                firstArray[row - 1] = firstNumber;
                secondArray[row - 1] = secondNumber;
            }
        }

        //принтирам първия масив = [34, 56, 2, 89]
        for (int number : firstArray) {
            System.out.print(number + " ");
        }

        System.out.println();//премнава на нов ред = сваля курсора на нов ред и следващото нещо, което ще се отпечатва ще бъде на нов ред

        //принтирам втория масив = [34, 56, 2, 89]
        for (int number : secondArray) {
            System.out.print(number + " ");
        }
    }
}
