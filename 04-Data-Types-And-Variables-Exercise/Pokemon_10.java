package DataTypes_Exercise;

import java.util.Scanner;

public class Pokemon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //данни за покемона
        int power = Integer.parseInt(scanner.nextLine()); //текуща сила
        int distance = Integer.parseInt(scanner.nextLine()); //растояние за изминаване
        int factor = Integer.parseInt(scanner.nextLine()); //фактор на изтощение
        int startPower = power; //първоначална сила

        int countPokes = 0; //брой намушквания

        //while
        //стоп: сила < разстояние
        //продължаваме: сила >= разстояние

        while (power >= distance) {
            //1. изминава разстоянието до целта -> power -= distance;
            power -= distance;
            //2. намушква
            countPokes++;
            //3. прверка за умора -> текуща сила == първоначална / 2
            if (power == startPower / 2 && factor != 0) {
                //делим power на factor -> power / factor
                power = power / factor; //power /= factor;
            }
        }

        //нямаме сила, за да преминем разстоянието
        System.out.println(power);
        System.out.println(countPokes);
    }

}
