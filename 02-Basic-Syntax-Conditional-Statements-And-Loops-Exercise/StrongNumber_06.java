package BasicsRecap;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни
        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number; //първоначалната стойност на числото, която не променям

        //2. обработим цифрите на числото

        //while цикъл
        //повтаряме: взимаме последна цифра -> ...... -> премахваме последната цифра
        //стоп: число <= 0 -> нямаме цифри в него
        //продължаваме: число > 0 -> има цифри в него

        int sumFactorial = 0; //сумата от факториелите на цифрите
        while (number > 0) {
            //1. взимаме последната цифра
            int lastDigit = number % 10; //последна или единствена цифра

            //2. изчисляваме факториела на последната цифра
            //7! = 1 * 2 * 3 * 4 * 5 * 6 * 7
            int factorial = 1;
            for (int i = 1; i <= lastDigit; i++) {
                factorial = factorial * i;
            }
            //знам колко е стойността на факториела на цифрата -> factorial

            //3. добавяме изчисления факториел към общата сума
            sumFactorial += factorial;

            //4. премахваме последната цифра
            number = number / 10; //number /= 10;
        }

        //сума от факториелите на цифрите на въведеното число: sumFactorial
        //проверка дали числото е strong
        if (startNumber == sumFactorial) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
