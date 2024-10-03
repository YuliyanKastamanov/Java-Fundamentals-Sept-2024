package Methods;

import java.util.Scanner;

public class RepeatString_07 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        String repeatedString = getRepeatedString(input, count);

        System.out.println(repeatedString);
    }

    private static String getRepeatedString(String input, int count) {

        String result = "";
        for (int i = 1; i <= count ; i++) {

            result = result + input;

        }

        return result;
    }
}
