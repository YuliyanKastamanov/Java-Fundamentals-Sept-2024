package Methods_Exercise;

import java.util.Scanner;

public class TopInteger_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {
            //проверка дали е топ
            //1. сумата от цифрите да се дели на 8 -> checkSumDigitsIsDivisibleBy8
            boolean isValidSumDigits = checkSumDigitsIsDivisibleBy8(number);
            //isValidSumDigits = true ->  сумата от цифрите се дели на 8
            //isValidSumDigits = false -> сумата от цифрите не се дели на 8

            //2. съдържа поне една нечетна цифра
            boolean isContainingOddDigit = checkContainsOddDigits(number);
            //isContainingOddDigit = true -> имаме поне една нечетна цифра
            //isContainingOddDigit = false -> нямаме нито една нечетна цифра

            if (isValidSumDigits && isContainingOddDigit) {
                //number e топ число
                System.out.println(number);
            }
        }
    }

    //метод, който проверява дали сумата от цифрите се дели на 8
    //true -> сумата от цифрите се дели на 8
    //false -> сумата от цифрите не се дели на 8
    public static boolean checkSumDigitsIsDivisibleBy8 (int number) {
        int sum = 0; //сума от цифрите
        //number > 0 -> в него има цифри
        //number <= 0 -> в него няма цифри
        while (number > 0) {
            int lastDigit = number % 10; //последна цифра
            sum += lastDigit; //сумираме последната цифра
            number /= 10; //премахваме последната цифра
        }
        //знаем сумата на цифрите на числото
        return sum % 8 == 0;
    }

    //метод, който проверява дали имаме поне една нечетна цифра в числото
    //true -> имаме поне една нечетна цифра
    //false -> нямаме нито една нечетна цифра
    public static boolean checkContainsOddDigits(int number) {
        //4356
        //number > 0 -> имаме цифри в числото
        //number <= 0 -> нямаме повече цифри в числото
        while (number > 0) {
            int lastDigit = number % 10; //последна цифра
            //проверка дали цифрата е нечетна
            if (lastDigit % 2 != 0) {
                //lastDigit е нечетна цифра -> поне една нечетна цифра
                return true;
            } else {
                //lastDigit е четна цифра -> премахвам
                number /= 10;
            }
        }
        //проверили всички цифри и никоя не е била нечетна
        return false;
    }
}
