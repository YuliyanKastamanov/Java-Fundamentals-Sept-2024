package BasicSyntaxConditionalStatementsAndLoops_W01.Labs;

import java.util.Scanner;

public class TimeAfter30Minutes_P04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int currentHour = Integer.parseInt(scanner.nextLine());
        int currentMinutes = Integer.parseInt(scanner.nextLine());

        //намираме общо колко минути имам -> дадения час умножаваме 60 и добавяме прочетените минути + 30 минути
        int totalMinutesAfter30Minutes = currentHour * 60 + currentMinutes + 30;

        //намираме часът след като сме добавили 30 минути
        int finalHours = totalMinutesAfter30Minutes / 60;
        //намираме минутите след като сме добавили 30 минути
        int finalMinutes = totalMinutesAfter30Minutes % 60;

        if(finalHours > 23){
            finalHours = 0;
        }

        System.out.printf("%d:%02d", finalHours, finalMinutes);



    }
}
