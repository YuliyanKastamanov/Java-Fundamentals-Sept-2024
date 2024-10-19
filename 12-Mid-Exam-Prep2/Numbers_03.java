package MidExamPrep;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt).collect(Collectors.toList());
        //numbers = {5, 2, 3, 4, -10, 30, 40, 50, 20, 50, 60, 60, 51}

        //2. намираме средноаритметичната стойност на елементите в списъка
        //average = sum / count
        int sum = 0; //сума на елементите в списъка
        for (int number : numbers) {
            sum += number;
        }
        double averageValue = sum * 1.0 / numbers.size();
        //averageValue = 28.079

        //3. всички числа, които са по-големи от средноритметичната стойност (averageValue)
        List<Integer> greaterNumbers = new ArrayList<>(); //числа, които са по-големи от averageValue
        //greaterNumbers = {}
        for (int number : numbers) {
            if (number > averageValue) {
                greaterNumbers.add(number);
            }
        }
        //greaterNumbers = {30, 40, 50, 50, 60, 60, 51}

        //4. сортираме намерените елементи (greaterNumbers) в намаляващ ред / descending order
        Collections.sort(greaterNumbers); //ascending order (нарастващ ред)
        //greaterNumbers = {30, 40, 50, 50, 51, 60, 60}
        Collections.reverse(greaterNumbers); //descending order (намаляващ ред)
        //greaterNumbers = {60, 60, 51, 50, 50, 40, 30}

        //5. Опечатване
        //нямаме числа, които да отговарят на условието -> greaterElements = {}, size = 0
        if (greaterNumbers.isEmpty()) {
            System.out.println("No");
        } else {
            //имаме числа, които да отговарят на условието -> greaterElements = {50, 40}, size > 0
            //1. брой числа <= 5 -> отпечатвам всички числа в списъка
            if (greaterNumbers.size() <= 5) {
                for (int number : greaterNumbers) {
                    System.out.print(number + " ");
                }
            } else {
                //2. брой числа > 5 -> отпечатвам само първите 5 числа в списъка
                //greaterNumbers = {60, 60, 51, 50, 50, 40, 30}
                //само позициите от 0 до 4
                for (int position = 0; position <= 4; position++) {
                    int currentNumber = greaterNumbers.get(position);
                    System.out.print(currentNumber + " ");
                }
            }

        }

    }
}
