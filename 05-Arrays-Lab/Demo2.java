package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Вариант 4 за запълване на масив

        String input = "1 2 3 4 5";
        String example = "1,2,3,4,5";// -> example.split(",") -> ["1", "2", "3", "4", "5"]

        String[] names = scanner.nextLine().split(" ");

        String [] nums = input.split(" "); //-> ["1", "2", "3", "4", "5"] -> получаваме масив от Стрингове

        int [] numbers = Arrays.stream(scanner.nextLine()
                .split(" "))//-> ["1", "2", "3", "4", "5"] -> получаваме масив от Стрингове
                .mapToInt(Integer::parseInt) // -> [1, 2, 3, 4, 5] -> преминаваме през всеки елемент и го преобразуваме в цяло число
                .toArray();// запазваме получия резултат към масива

        double [] salaries = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();





        /*for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(nums[i]);
        }*/

        /*

        1. Масивът е съвкупност от еднотипни елементи
        2. Масивът има постоянна дължина - статичен
        3. Дължината на масива = броя елементи в него
        4. позиции/индекси -> започваме от 0 до дължината - 1
        5. Задаваме стойност на елемент: array[0] = 99
        6. Достъпваме елемент в масив -> array[10] - достъпваме елемента на индекс 10
        7. Foreach - обхождаме масив последавателно от първия до последния елемент
        8. For - обхождаме масив, когато ни трябва да работим с конкретен индекс
        9. Пълнене на масиви -> Demo1 Вариант1, Вариант2, Вариант3, Demo2 Вариант4


             */
    }
}
