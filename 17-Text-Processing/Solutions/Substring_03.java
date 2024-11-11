package TextProcessing;

import java.util.Scanner;

public class Substring_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringToRemove = scanner.nextLine();
        String input = scanner.nextLine();

        while (input.contains(stringToRemove)) {

            input = input.replace(stringToRemove, "");//kicegiciceeb -> kgiceb -> kgb
        }

        System.out.println(input);
    }
}
