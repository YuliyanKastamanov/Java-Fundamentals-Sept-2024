package ListsLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countProducts = Integer.parseInt(scanner.nextLine()); //брой на продуктите
        List<String> products = new ArrayList<>(); //списък с продуктите

        for (int count = 1; count <= countProducts; count++) {
            String productName = scanner.nextLine();
            products.add(productName);
        }


        //sort -> сортира елементите на дадена колекция (масив / лист) в ascending order (нарастващ ред)
        //sort на колекция с числа (дробни / цели) -> нарастващ ред от най-малкото към най-голямото
        //sort на колекция с текстове -> нарастващ ред от a към z

        //products = {"Potatoes", "Tomatoes", "Onions", "Apples"}
        Collections.sort(products);
        //products = {"Apples", "Onions", "Potatoes", "Tomatoes"}

        int number = 1; //пореден номер на продукта
        for (String product : products) {
            System.out.println(number + "." + product);
            number++;
        }

    }
}
