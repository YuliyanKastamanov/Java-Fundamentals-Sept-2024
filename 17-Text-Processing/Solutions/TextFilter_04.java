package TextProcessing;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //входни данни
        String [] badWords = scanner.nextLine().split(", ");
        //"Linux, Windows".split(", ") -> ["Linux", "Windows"]

        String text = scanner.nextLine();

        for (String badWord : badWords) {
            //badWord = "Windows"
            //replacement = "*******"

            String replacement = ""; //заместителя на лошата дума
            for (int count = 1; count <= badWord.length(); count++) {
                replacement += '*';
            }

            text = text.replace(badWord, replacement);
        }

        System.out.println(text);
    }
}
