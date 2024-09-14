package BasicsRecap;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни
        double budget = Double.parseDouble(scanner.nextLine()); //наличния бюджет
        int countStudents = Integer.parseInt(scanner.nextLine()); //брой джедаи, които трябва да оборудваме
        double priceSaber = Double.parseDouble(scanner.nextLine()); //цена за 1 меч
        double priceRobe = Double.parseDouble(scanner.nextLine()); //цена за 1 роба
        double priceBelt = Double.parseDouble(scanner.nextLine()); //цена за 1 колан

        //2. сума за мечове = брой на мечове * цена за 1 меч
        double sumSabers = Math.ceil(countStudents + 0.10 * countStudents) * priceSaber;

        //3. сума за роби = брой на роби * цена за 1 роба
        double sumRobes = countStudents * priceRobe;

        //4. сума за колани = брой на колани * цена за 1 колан
        double sumBelts = (countStudents - countStudents / 6) * priceBelt;

        //5. намирам общата сума, която трябва да платя
        double totalSum = sumSabers + sumRobes + sumBelts;

        //6. проверка дали ни е достатъчен бюджетът
        if (budget >= totalSum) {
            //Достатъчен
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            //budget < totalSum -> не е достатъчен
            double neededMoney = totalSum - budget;
            System.out.printf("George Lucas will need %.2flv more.", neededMoney);
        }
    }
}
