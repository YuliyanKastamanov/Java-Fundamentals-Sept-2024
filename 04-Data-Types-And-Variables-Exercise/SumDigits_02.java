package DataTypesAndVariables;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0; //сума от цифрите на числото

        //While цикъл -> не знаем точно колко пъти ще имаме повторение
        //стоп: число <= 0 -> няма цифри в него
        //продължаваме: число > 0 -> има цифри в него
        //повтаряме:
        //1. взимаме последната цифра
        //2. добавяме я към общата сума на цифрите
        //3. премахваме последната цифра

        while (number > 0) {
            //1. взимаме последната цифра
            int lastDigit =  number % 10;
            //2. добавяме я към общата сума на цифрите
            sum += lastDigit; //sum = sum + lastDigit;
            //3. премахваме последната цифра
            number = number / 10;
        }

        //нямаме повече цифри в числото
        System.out.println(sum);
    }
}
