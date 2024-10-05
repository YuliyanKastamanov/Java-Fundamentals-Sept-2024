package Methods_Exercise;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //входни данни
        String text = scanner.nextLine().toLowerCase();
        //"DesisLAvA".toLowerCase() -> "desislava"

        printVowelsCount(text);

    }

    //метод, който отпечатва броя на гласните букви в текста
    public static void printVowelsCount (String text) {
        //малки гласни букви: a, o, u, e, i
        int count = 0; //брой на гласните букви

        //text = "softuni".toCharArray() -> ['s', 'o', 'f', 't', 'u', 'n', 'i']
        for (char symbol : text.toCharArray()) {
            //проверка дали е малка гласна буква
            if (symbol == 'a' || symbol == 'o' || symbol == 'u'
                    || symbol == 'e' || symbol == 'i') {
                count++;
            }
        }

        //знаем броят на малките гласни букви
        System.out.println(count);
    }
}
