package DataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sourceAvailability = Integer.parseInt(scanner.nextLine()); //брой налични подправки в Source / поле
        int days = 0; //брой дни, в които събираме подправки
        int totalSpices = 0; //обща стойност на събраните подправки

        //повтаряме: събираме подправки от Source (поле)
        //stop: sourceAvailability < 100 -> спираме да събираме подправки
        //продължаваме: sourceAvailability >= 100 -> събираме подправки

        while (sourceAvailability >= 100) {
            //събираме подправки
            days++;
            //1. колко на брой подправки събираме
            int spicePerDay = sourceAvailability - 26;
            //2. сумирам събраните подправки за ден
            totalSpices += spicePerDay;
            //3. полето, от което добиваме подправката отслабва
            sourceAvailability -= 10;
        }

        //спираме да събираме подправки, защото вече Source / поле не е годно
        //бракуваме 26 от събраните
        totalSpices -= 26;

        //не можем след бракуването да сме на минус
        if (totalSpices < 0) {
            totalSpices = 0;
        }

        System.out.println(days);
        System.out.println(totalSpices);

    }
}
