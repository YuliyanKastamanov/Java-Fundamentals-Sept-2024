package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationsBasics_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. прочитаме списък с цели числа
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt).collect(Collectors.toList());

        //scanner.nextLine() -> "4 19 2 53 6 43"
        //.split -> ["4", "19", "2", "53", "6", "43"]
        //.map(Integer::parseInt) -> [4, 19, 2, 53, 6, 43]
        //.toList() -> {4, 19, 2, 53, 6, 43} -> създаваме списък, който не подлежи на модификация
        //.collect(Collectors.toList()); -> {4, 19, 2, 53, 6, 43} -> създаваме списък, който подлежи на модификация

        //numbers = {4, 19, 2, 53, 6, 43}

        //2. въвеждаме команди до получаване на "end"
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            //валидна команда, чрез която трябва да модифицираме списъка
            //1. command = "Add 12".split(" ")          -> ["Add", "12"]
            //2. command = "Remove 53".split(" ")       -> ["Remove", "53"]
            //3. command = "RemoveAt 0".split(" ")      -> ["RemoveAt", "0"]
            //4. command = "Insert 109 2".split(" ")    -> ["Insert", "109", "2"]

            String[] commandParts = command.split(" ");
            String commandName = commandParts[0]; //"Add", "Remove", "RemoveAt", "Insert"

            //проверка коя команда е въведена
            switch (commandName) {
                case "Add" -> {
                    //добавяме числото от командата в края на списъка
                    int numberToAdd = Integer.parseInt(commandParts[1]);
                    numbers.add(numberToAdd);
                }
                case "Remove" -> {
                    //премахваме числото от командата от списъка
                    int numberToRemove = Integer.parseInt(commandParts[1]);
                    numbers.remove(Integer.valueOf(numberToRemove)); //Integer.valueOf - елемент
                }
                case "RemoveAt" -> {
                    //премахваме числото на дадената позиция в командата от списъка
                    int positionForRemove = Integer.parseInt(commandParts[1]);
                    numbers.remove(positionForRemove); //позиция
                }
                case "Insert" -> {
                    //вмъкваме даденото число от командата на дадената позиция от командата
                    int numberForInsert = Integer.parseInt(commandParts[1]);
                    int positionForInsert = Integer.parseInt(commandParts[2]);
                    numbers.add(positionForInsert, numberForInsert);
                }
            }
            command = scanner.nextLine();
        }

        //отпечатваме елементите на списъка разделени с интервал
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
