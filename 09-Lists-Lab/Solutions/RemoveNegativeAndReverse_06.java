package ListsLab;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativeAndReverse_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. прочитаме списък с цели числа от първия ред на конзолата
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt).toList();

        //numbers = {10, -5, 7, 9, -33, 50}

        //2. оставаме да работим само с положителните числа
        List<Integer> positiveNumbers = new ArrayList<>(); //положителните числа

        for (int number : numbers) {
            if (number > 0) {
                //положително число
                positiveNumbers.add(number);
            }
        }

        //positiveNumbers -> имаме само положителните числа от първоначалния списък
        //positiveNumbers = {10, 7, 9, 50}

        //3. проверка дали имаме положителни числа
        if (positiveNumbers.isEmpty()) {
            //празен списък -> нямаме положителни числа
            System.out.println("empty");
        } else {
            //пълен списък -> имаме положителни числа -> reverse на списъка
            //positiveNumbers = {10, 7, 9, 50}
            Collections.reverse(positiveNumbers); //обръща списъка на обратно
            //positiveNumbers = {50, 9, 7, 10}

            for (int number : positiveNumbers) {
                System.out.print(number + " ");
            }
        }

    }
}
