import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //входни данни
        String input = scanner.nextLine(); //"George Peter".split(" ") -> ["George", "Peter"]

        String firstText = input.split(" ")[0]; //"George"
        String secondText = input.split(" ")[1]; //"Peter"

        printSumCharacters(firstText, secondText);
    }

    private static void printSumCharacters(String firstText, String secondText) {
        //кой е по-късия текст и неговата дължина
        int minLength = Math.min(firstText.length(), secondText.length()); //дъжлина на по-късия текст

        //"George" -> length = 6 -> position [0; 5]
        //"Peter" -> length = 5 -> position [0; 4]
        int sum = 0;
        for (int position = 0; position <= minLength - 1; position++) {
            char symbolFirstText = firstText.charAt(position);
            char symbolSecondText = secondText.charAt(position);

            int multiplication = symbolFirstText * symbolSecondText;
            sum += multiplication;
        }

        //!!! имаме ли още символи в някой текст, които не сме обходили !!!
        //1. ако двата въведени текста са еднакви -> обходили и умножили всички символи
        if (firstText.length() == secondText.length()) {
            System.out.println(sum);
        }
        //2. първия текст е по-дълъг
        else if (firstText.length() > secondText.length()) {
            //George
            //обходим останалите символи
            for (int position = minLength; position <= firstText.length() - 1; position++) {
                char currentSymbol = firstText.charAt(position);
                sum += currentSymbol;
            }
            //имаме всички символи обходени
            System.out.println(sum);
        }
        //3. ако втория текст е по-дълъг
        else { //secondText.length() > firstText.length()
            //George
            //обходим останалите символи
            for (int position = minLength; position <= secondText.length() - 1; position++) {
                char currentSymbol = secondText.charAt(position);
                sum += currentSymbol;
            }
            //имаме всички символи обходени
            System.out.println(sum);
        }

    }
}
