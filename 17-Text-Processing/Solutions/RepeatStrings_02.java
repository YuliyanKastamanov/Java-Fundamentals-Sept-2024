package TextProcessing;

import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //входни данни
        String [] words = scanner.nextLine().split(" ");
        //"hi abc add".split(" ") -> ["hi", "abc", "add"]

        StringBuilder resultText = new StringBuilder(); //""
        for (String word : words) {
            //добавям я към резултатния текст толкова на брой пъти колкото е дължината ѝ
            int length = word.length(); //дължината на текста

            for (int count = 1; count <= length; count++) {
                resultText.append(word);
            }
        }

        System.out.println(resultText);

    }
}
