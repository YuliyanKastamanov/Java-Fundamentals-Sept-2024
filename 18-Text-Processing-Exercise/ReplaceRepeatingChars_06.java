package TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder(input); //"aaaaabbbbbcdddeeeedssaa"

        for (int position = 0; position < sb.length() - 1; position++) {
            if (sb.charAt(position) == sb.charAt(position + 1)) {
                sb.deleteCharAt(position + 1);
                position--;
            }
        }

        System.out.println(sb);



    }
}
