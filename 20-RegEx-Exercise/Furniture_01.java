package RegEx_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //прочитаме входните данни
        //>>Sofa<<312.23!3
        String input = scanner.nextLine();

        //текст на шаблона
        String regex = ">>(?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);// шаблон
        double totalPrice = 0;
        System.out.println("Bought furniture:");

        while (!input.equals("Purchase")){
            //input = ">>Sofa<<312.23!3";
            Matcher matcher = pattern.matcher(input);
            // matcher.find() -> true - когато нашия текст отговаря на шаблона
            // or false - когато нашия текст не отговаря на шаблона

            if(matcher.find()){
                // matcher.find() -> true - когато нашия текст отговаря на шаблона
                String furnitureName = matcher.group("furnitureName");// "Sofa"
                double price = Double.parseDouble(matcher.group("price"));//312.23
                int quantity = Integer.parseInt(matcher.group("quantity"));//3
                System.out.println(furnitureName);

                totalPrice += price * quantity;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
