package TextProcessing;

import java.util.Locale;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //създаване на текстова променлива
        String name = "Hello, Softuni";

        //прочитане на текст от конзолата
        String input = scanner.nextLine();

        //дължина на текст = брой на символите
        int length = name.length();
        System.out.println(name.length()); //14

        //достъпваме символи от даден текст
        char firstSymbol = name.charAt(0);
        System.out.println(name.charAt(0)); //H
        System.out.println(name.charAt(name.length() - 1)); //i

        //текст може да се преобразува в масив от символи
        char[] symbols = name.toCharArray(); //['H', 'e', 'l', 'l', ...]

        //обхождане на текст
        //1. for цикъл - когато искаме да достъпим символите в текста и имаме работа с позициите на тези символи
        for (int position = 0; position <= name.length() - 1; position++) {
            if (position % 2 == 0) {
                System.out.println(name.charAt(position));
            }
        }

        //2. foreach цикъл - когато искаме да достъпим символите в текста
        //name = "Desi".toCharArray() -> ['D', 'e', 's', 'i']
        for (char symbol : name.toCharArray()) {
            System.out.println(symbol);
        }

        //String is immutable (read-only)
        System.out.println(name.charAt(6));
        name = name.replace('f', 'm');

        //конкатенация (+) - долепяне на текстове
        String firstName = "Desislava";
        String lastName = "Topuzakova";
        int age = 26;
        double grade = 5.90;
        char symbol = 'R';

        String fullName = firstName + lastName;
        System.out.println(firstName + lastName); //"DesislavaTopuzakova" -> string + string = string
        System.out.println(firstName + age); // "Desislava26" -> string + int = string
        System.out.println(lastName + grade); // "Topuzakova5.90" -> string + double = string
        System.out.println(firstName + symbol); //"DesislavaR" -> string + char = string

        //конкатенация (concat) -> долепяне на текстове
        String sentence = firstName.concat(" ").concat(lastName).concat(" is ").concat("" + age);
        //"Desislava Topuzakova is 26"

        //Join - взимаме текстове и да ги разделяме с определен разделите
        String textJoin = String.join(", ", "con", "ca", "ten", "ate");
        //"con, ca, ten, ate"

        String [] names = new String[3];
        names[0] = "Ivan";
        names[1] = "Georgi";
        names[2] = "Pesho";
        String namesJoin = String.join("", names);
        //"IvanGeorgiPesho"

        //Substring
        //начин 1: substring(startPosition)
        String text = "I am Desislava Topuzakova from Stara Zagora";
        String town = text.substring(31); //"Stara Zagora"

        //начин 2: substring(startPosition, endPosition)
        String last = text.substring(15, 25); //"Topuzakova"

        //IndexOf
        //позицята, от която за първи път срещаме дадения текст
        //-1 -> дадения текст не можем да го намерим
        String fruits = "banana, apple, kiwi, banana, apple";
        System.out.println(fruits.indexOf("banana"));   // 0
        System.out.println(fruits.indexOf("apple"));    // 8
        System.out.println(fruits.indexOf("orange"));   //-1

        //LastIndexOf
        //позицята, от която за последен път срещаме дадения текст
        //-1 -> дадения текст не можем да го намерим
        System.out.println(fruits.lastIndexOf("banana")); // 21
        System.out.println(fruits.lastIndexOf("r"));
        System.out.println(fruits.lastIndexOf("orange")); // -1

        //Contains - проверка дали даден текст се съдържа в друг текст
        String firstText = "I love fruits.";
        boolean isContains = firstText.contains("test");
        System.out.println(firstText.contains("fruits"));// true
        System.out.println(firstText.contains("banana")); // false

        if (firstText.contains("Ivan")) {
            System.out.println("hello");
        }

        //Split
        String email = "Hello, john@softuni.bg, you have been using john@softuni.bg in your registration";
        String[] words = email.split(" ");
        //words = ["Hello,", "john@softuni.bg,", "you", "have", "been", "using", "john@softuni.bg", "in", "your", "registration"]

        //Replace - да заменим един текст с друг
        String replacedText = email.replace("john@softuni.bg", "ivan@softuni.bg");
        //replacedText = "Hello, ivan@softuni.bg, you have been using ivan@softuni.bg in your registration"
        System.out.println(replacedText);

        //Сравняване на текстове
        //equals -> return boolean value (true / false)
        //true -> текстовете са еднакви (еднаква дължина и еднакъв символен състав)
        //false -> текстовете са различни
        boolean areEquals = email.equals(text);
        System.out.println(email.equals(text));
        if (email.equals(text)) {
            System.out.println("Hello");
        }

        //Малки и главни букви
        String word = "tABle";
        String lowerWord = word.toLowerCase();
        String upperWord = word.toUpperCase();

        System.out.println(word.toLowerCase()); //"table"
        System.out.println(word.toUpperCase()); //"TABLE"




    }
}
