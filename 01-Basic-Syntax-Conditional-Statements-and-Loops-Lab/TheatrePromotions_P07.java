package BasicSyntaxConditionalStatementsAndLoops_W01.Labs;

import java.util.Scanner;

public class TheatrePromotions_P07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        /*Day / Age	0 <= age <= 18,	18 < age <= 64,	64 < age <= 122
        Weekday	     12$	            18$	                12$
        Weekend	     15$	            20$	                15$
        Holiday	      5$	            12$	                10$
        */

        int price = 0;
        boolean isValid = true;
        switch (typeOfDay){
            case "Weekday" -> {

                if((age >= 0 && age <= 18) || (age > 64 && age <= 122)){
                    price = 12;
                }else if(age > 18 && age <= 64){
                    price = 18;
                }else {
                    isValid = false;
                }

            }
            case "Weekend" -> {
                if((age >= 0 && age <= 18) || (age > 64 && age <= 122)){
                    price = 15;
                }else if(age > 18 && age <= 64){
                    price = 20;
                }else {
                    isValid = false;
                }

            }

            case "Holiday" -> {

                if(age >= 0 && age <= 18){
                    price = 5;
                }else if(age > 18 && age <= 64){
                    price = 12;
                }else if (age > 64 && age <= 122){
                    price = 10;
                }else {
                    isValid = false;
                }

            }

        }

        if(isValid){
            System.out.printf("%d$", price);
        }else {
            System.out.println("Error!");
        }

    }
}
