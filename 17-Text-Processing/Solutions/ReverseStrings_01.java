package TextProcessing;

import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        while (!word.equals("end")) {
            //word = "helLo" -> думата в прав ред
            //reversedWord = "oLleh" -> думата в обратен ред

            StringBuilder reversedWord = new StringBuilder(); //обърната дума -> ""
            for (int position = word.length() - 1; position >= 0; position--) {
                char currentSymbol = word.charAt(position);
                reversedWord.append(currentSymbol);
                //reversedWord += currentSymbol;
            }

            //word -> думата в прав ред
            //reversedWord -> думата в обратен ред
            System.out.printf("%s = %s%n", word, reversedWord.toString());

            word = scanner.nextLine();
        }
    }
}
