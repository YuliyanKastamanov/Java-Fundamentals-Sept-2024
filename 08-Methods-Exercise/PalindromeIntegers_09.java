package Methods_Exercise;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //While цикъл
        //повтаряме: въвеждаме входни данни
        //стоп: входни данни == "END"
        //продължаваме: входни данни != "END"

        String input = scanner.nextLine(); //входни данни -> текст: "123", "323", "988", "121"

        while (!input.equals("END")) {
            //обработвам въведените входни данни -> проверка дали въведения текст е палиндром
            if (checkPalindrome(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            //въвеждам нови входни данни
            input = scanner.nextLine();
        }
    }

    //метод, който проверява дали даден текст е палиндром
    //true -> ако текстът е палиндром
    //false -> ако текстът не е палиндром
    public static boolean checkPalindrome(String text) {
        //палиндром: text == reversedText
        //String text - текста, прочетен от ляво към дясно
        String reversedText = ""; //текста, прочетен от дясно към ляво

        for (int position = text.length() - 1; position >= 0; position--) {
            char currentSymbol = text.charAt(position);
            reversedText += currentSymbol;
        }

        return text.equals(reversedText);
    }
}
