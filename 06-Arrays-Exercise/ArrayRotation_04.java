package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни
        int[] numbers = Arrays.stream(scanner.nextLine()  //"51 47 32 61 21"
                        .split(" ")) //["51", "47", "32", "61", "21"]
                        .mapToInt(Integer::parseInt) //[51, 47, 32, 61, 21]
                        .toArray();

        int rotations = Integer.parseInt(scanner.nextLine()); //брой ротации

        //numbers = [51, 47, 32, 61, 21]
        for (int rotation = 1; rotation <= rotations; rotation++) {
            //ротация на масива
            //1. взимаме първия елемент
            int firstElement = numbers[0]; //51
            //2. преместваме / копираме елементите наляво
            //!!! не променяме нищо на последната позиция
            for (int position = 0; position < numbers.length - 1 ; position++) {
                numbers[position] = numbers[position + 1];
            }
            //3. поставяме първия елемент на последната позиция
            numbers[numbers.length - 1] = firstElement;
        }

        //приключили с ротациите -> принтираме елементите на масива
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
