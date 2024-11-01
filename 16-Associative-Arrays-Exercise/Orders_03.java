package Maps_Exercise;

import java.util.*;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> productsPrice = new LinkedHashMap<>();
        Map<String, Integer> productsQuantity = new LinkedHashMap<>();

        String input = scanner.nextLine(); //входни данни
        while (!input.equals("buy")) {
            //input = "{name} {price} {quantity}".split(" ") -> ["{name}", "{price}", "{quantity}"]
            String productName = input.split(" ")[0]; //име на продукт
            double productPrice = Double.parseDouble(input.split(" ")[1]); //ед. цена на продукта
            int quantity = Integer.parseInt(input.split(" ")[2]); //количество продукт

            //проверка за количество
            //1. нямаме такъв продукт
            if (!productsQuantity.containsKey(productName)) {
                productsQuantity.put(productName, quantity);
            }
            //2. имаме такъв продукт
            else {
                int currentQuantity = productsQuantity.get(productName);
                productsQuantity.put(productName, currentQuantity + quantity);
            }

            //проверка за цената
            productsPrice.put(productName, productPrice);

            input = scanner.nextLine();
        }


        //productsPrice: продукт -> цена
        //productsQuantity: продукт -> количество

        for (Map.Entry<String, Double> entry : productsPrice.entrySet()) {
            //entry
            //entry.getKey() -> име на продукт
            //entry.getValue() -> цена на продукта
            String productName = entry.getKey();
            double price = entry.getValue();
            int quantity = productsQuantity.get(productName);
            double totalPrice = price * quantity;
            System.out.printf("%s -> %.2f%n", productName, totalPrice);
        }
    }
}
