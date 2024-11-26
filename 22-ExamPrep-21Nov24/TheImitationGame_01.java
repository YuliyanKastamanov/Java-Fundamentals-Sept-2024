package ExamPreparation;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine(); //криптирано съобщение
        StringBuilder modifiedMessage = new StringBuilder(encryptedMessage); //модифицираме криптираното съобщение

        String command = scanner.nextLine();
        while (!command.equals("Decode")) {
            //command си държа валидна команда
            //проверка коя команда е въведена
            if (command.contains("Move")) {
                //command = "Move|3".split("|") -> ["Move", "3"]
                //Moves the first n letters to the back of the string
                int countLetters = Integer.parseInt(command.split("\\|")[1]); //брой на първите букви, които трябва да преместим
                //"Ivan Ivanov" -> първите 3 букви "Iva" -> "n IvanovIva"
                String firstLetters = modifiedMessage.substring(0, countLetters); //букви за местене "Iva"
                modifiedMessage.delete(0, countLetters); //"n Ivanov"
                modifiedMessage.append(firstLetters); //"n IvanovIva"
            } else if (command.contains("Insert")) {
                //command = "Insert|2|abc".split("|") -> ["Insert", "2", "abc"]
                //Inserts the given value before the given index in the string
                //"Ivan Ivanov" -> вмъкваме на втора позиция тескта abc -> "Ivabcn Ivanov"
                int position = Integer.parseInt(command.split("\\|")[1]); //позиция, на която трябва да вмъкнем текст
                String textToInsert = command.split("\\|")[2]; //текст, който трябва да се вмъкне в съобщение
                modifiedMessage.insert(position, textToInsert);
            } else if (command.contains("ChangeAll")) {
                //command = "ChangeAll|abc|cba".split("|") -> ["ChangeAll", "abc", "cba"]
                //Changes all occurrences of the given substring with the replacement text
                String textForChange = command.split("\\|")[1]; //текст, който трябва да се замени
                String replacement = command.split("\\|")[2]; //текст, който ще заменя
                //"Ivabcn Ivanov" -> "Ivcban Ivanov"
                String currentMessage = modifiedMessage.toString(); //текущото съобщение
                currentMessage = currentMessage.replace(textForChange, replacement);
                modifiedMessage = new StringBuilder(currentMessage);
            }

            command = scanner.nextLine();
        }

        System.out.println("The decrypted message is: " + modifiedMessage);
    }
}
