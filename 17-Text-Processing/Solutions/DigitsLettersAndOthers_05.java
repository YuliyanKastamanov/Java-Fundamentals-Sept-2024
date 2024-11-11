package TextProcessing;

import java.util.Scanner;

public class DigitsLettersAndOthers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine(); //"Agd#53Dfg^&4F53"

        StringBuilder digits = new StringBuilder(); //всички символи, които са цифри
        StringBuilder letters = new StringBuilder(); //всички символи, които са букви
        StringBuilder others = new StringBuilder(); //всички останали символи, които не са букви или цифри

        //text = "Ivan".toCharArray() -> ['I', 'v', 'a', 'n']
        for (char symbol : text.toCharArray()) {
            //проверка дали символа е цифра
            if (Character.isDigit(symbol)) {
                digits.append(symbol);
            }
            //проверка дали символа е буква
            else if (Character.isLetter(symbol)) {
                letters.append(symbol);
            }
            //символът не е нито буква, нито цифра
            else {
                others.append(symbol);
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);

    }
}
