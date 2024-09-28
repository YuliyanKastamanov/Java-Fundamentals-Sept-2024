package Arrays_Exercise;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни
        String firstRow = scanner.nextLine(); //"Hey hello 2 4"
        String secondRow = scanner.nextLine(); //"10 hey 4 hello"

        //2. създаването на масивите
        String[] firstArray = firstRow.split(" "); //["Hey", "hello", "2", "4"]
        String[] secondArray = secondRow.split(" "); //["10", "hey", "4", "hello"]

        //за всеки един елемент от втория масив -> проверка дали го има в първия масив
        for (String el2: secondArray) {
            for (String el1 : firstArray) {
                if (el2.equals(el1)) {
                    System.out.print(el2 + " ");
                }
            }
        }
    }
}
