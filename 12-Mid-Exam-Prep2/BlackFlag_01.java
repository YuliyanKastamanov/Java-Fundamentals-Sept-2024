package MidExamPrep;

import java.util.Scanner;

public class BlackFlag_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //входни данни
        int days = Integer.parseInt(scanner.nextLine()); //общ брой дни, в които имаме грабежи
        int plundersPerDay = Integer.parseInt(scanner.nextLine()); //брой грабежи за ден
        double targetCountPlunders = Double.parseDouble(scanner.nextLine()); //брой целеви грабежи

        //1. изчисляваме брой направени кражби
        double totalCountPlunders = 0; //общ брой грабежи
        for (int day = 1; day <= days; day++) {
            //повтаряме: извършваме някакви грабежи = plundersPerDay
            totalCountPlunders += plundersPerDay;

            //проверка дали имаме допълнителни грабежи
            if (day % 3 == 0) {
                double additionalPlunders = 0.5 * plundersPerDay;
                totalCountPlunders += additionalPlunders;
            }

            //проверка дали имаме битка с вражески кораб
            if (day % 5 == 0) {
                //общ брой кражби - 30%
                totalCountPlunders = totalCountPlunders - 0.30 * totalCountPlunders;
                //totalCountPlunders = totalCountPlunders * 0.7;
                //totalCountPlunders *= 0.7;

            }
        }

        //обходили всички дни -> колко са общо направените грабежи -> totalCountPlunders
        //2. проверка дали сме постигнали целта
        if (totalCountPlunders >= targetCountPlunders) {
            //постигнали сме целта си
            System.out.printf("Ahoy! %.2f plunder gained.", totalCountPlunders);
        } else {
            //totalCountPlunders < targetCountPlunders
            //не постигаме целта си
            double percent = (totalCountPlunders / targetCountPlunders) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percent);
        }

    }
}
