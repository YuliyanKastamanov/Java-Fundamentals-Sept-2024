package DataTypesAndVariables;

import java.util.Scanner;

public class PrintPartOfAsciiTable_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startCode = Integer.parseInt(scanner.nextLine()); //60
        int endCode = Integer.parseInt(scanner.nextLine());  //65

        for (int code = startCode; code <= endCode; code++) {
            System.out.print((char) code + " ");
        }
    }
}
