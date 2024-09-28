package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. въвеждаме масив от цели числа
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt).toArray();
        //"23 -2 321 87 42 90 -123".split(" ")
        // -> ["23", "-2", "321", "87", "42", "90", "-123"]
        // -> [23, -2, 321, 87, 42, 90, -123]

        //2. въвеждаме команди (текст) докато не получа командата end
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            //command != "end" -> валидна команда

            //проверка кой вид команда е въведена
            if (command.contains("swap")) {
                //1. command = "swap 1 2".split(" ") -> ["swap", "1", "2"]
                int positionFirstNumber = Integer.parseInt(command.split(" ")[1]);
                int positionSecondNumber = Integer.parseInt(command.split(" ")[2]);

                int firstNumber = numbers[positionFirstNumber];
                int secondNumber = numbers[positionSecondNumber];

                //размяна
                numbers[positionFirstNumber] = secondNumber;
                numbers[positionSecondNumber] = firstNumber;
            } else if (command.contains("multiply")) {
                //2. command = "multiply 2 3".split(" ") -> ["multiply", "2", "3"]
                int positionFirstNumber = Integer.parseInt(command.split(" ")[1]);
                int positionSecondNumber = Integer.parseInt(command.split(" ")[2]);

                int firstNumber = numbers[positionFirstNumber];
                int secondNumber = numbers[positionSecondNumber];

                int product = firstNumber * secondNumber;
                numbers[positionFirstNumber] = product;

            } else if (command.equals("decrease")) {
                //3. command = "decrease"
                //обхождаме всеки един елемент -> -1
                for (int position = 0; position <= numbers.length - 1; position++) {
                    numbers[position]--;
                }
            }
            command = scanner.nextLine();
        }

        //отпечатваме числата в масива разделени със ", "
        //[7, 12, 34, 56, 78] -> 7, 12, 34, 56, 78
        for (int position = 0; position < numbers.length; position++) {
            int number = numbers[position];
            if (position != numbers.length - 1) {
                System.out.print(number + ", ");
            } else {
                //position == numbers.length - 1
                System.out.print(number);
            }
        }

    }
}
