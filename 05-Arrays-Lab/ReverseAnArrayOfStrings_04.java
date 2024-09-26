package Arrays;

import java.util.Scanner;

public class ReverseAnArrayOfStrings_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");//["a", "b", "c", "d", "e"]

        for (int i = 0; i < input.length / 2 ; i++) {
            String currentElement = input[i];
            int currentIndex = input.length - 1 - i;


            input[i] = input[currentIndex];
            input[currentIndex] = currentElement;

        }

        String finalResult = String.join(" ", input);

        System.out.println(finalResult);
    }
}
