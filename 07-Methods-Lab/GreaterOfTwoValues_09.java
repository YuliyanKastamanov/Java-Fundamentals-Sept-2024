package Methods;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String valueType = scanner.nextLine();

        //int, char,  string

        switch (valueType){

            case "int" -> {
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                int maxValue = getMaxValue(firstNum, secondNum);
                System.out.println(maxValue);
            }

            case "char" -> {

                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                char maxValue = getMaxValue(firstChar, secondChar);
                System.out.println(maxValue);

            }

            case "string" -> {

                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                String maxValue = getMaxValue(firstString, secondString);
                System.out.println(maxValue);
            }

        }
    }

    private static String getMaxValue(String firstString, String secondString) {

        int compareToResult = firstString.compareTo(secondString);

        if( compareToResult >= 0){
            return firstString;
        }
        return secondString;
    }

    private static int getMaxValue(int number1, int number2){
        if(number1 > number2){
            return number1;
        }
        return number2;
    }

    private static char getMaxValue(char symbol1, char symbol2){
        if (symbol1 > symbol2){
            return symbol1;
        }
        return symbol2;
    }
}
