package BasicSyntaxConditionalStatementsAndLoops_W01.Labs;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //1. Тип, 2. Име - EN, camelCase, 3. Максимално описателно

        String name = scanner.nextLine();

        int number = Integer.parseInt(scanner.nextLine());

        double salary = Double.parseDouble(scanner.nextLine());

        char symbol = scanner.nextLine().charAt(0);

        boolean isTrue = true;//false

        //char symbol = scanner.nextLine().charAt(0);

        int asciiNumber = scanner.nextLine().charAt(0);

        System.out.println("Hello world!");
        System.out.print("Hello world!");

        // Когато принтираме форматирано можем да използваме шаблони
        //1. int - %d, double - %f, String - %s, char - %c, new line - %n
        System.out.printf("I'm %s!", name);


        int a = Integer.parseInt(scanner.nextLine());
        int b = 10;
        System.out.println(a < b);
        System.out.println(a > 0);
        System.out.println(a > 100);
        System.out.println(a < a);
        System.out.println(a <= 5);
        System.out.println(b == 2 * a);


        if (a <= 0){
            System.out.println("a is zero or negative.");
        }else if(a <= 10){
            System.out.println("a is between 1 and 10.");
        } else if (a <= 100) {
            System.out.println("a is between 11 and 100.");
        }

        // събиране + -> String + int -> String ->
        System.out.println("Number: " + 10 + 5);// Number: 105

        // изваждане -
        // умножение *
        // деление -> 5 / 2
        // деление с остатък -> 5 % 2 -> ката резултат получаваме остатъка от целочисленото деление

        int day = Integer.parseInt(scanner.nextLine());

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Working day!");
            case 6, 7 -> System.out.println("Weekend!");
            default -> System.out.println("Error!");
        }

        for (int i = 1; i <= 3; i++) {

            System.out.println("You are on floor " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("You are in apartment " + j);
            }

        }





    }
}
