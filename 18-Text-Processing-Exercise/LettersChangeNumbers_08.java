package TextProcessingExercise;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //входни данни
        String input = scanner.nextLine(); //"A12b s17G"
        String [] codes = input.split("\\s+"); //["A12b", "s17G"]

        double sum = 0; //сума от мофицираните числа на всички кодове
        for (String code : codes) {
            //code: "{буква}{число}{буква}"

            //1. модифицирам числото в кода спрямо буквите
            double modifiedNumber = getModifiedNumber(code); //модифицирано число

            //2. сумирам
            sum += modifiedNumber;
        }

        System.out.printf("%.2f", sum);

    }

    //метод, който връща модифицираното число от кода
    public static double getModifiedNumber(String code) {
        //code: "{буква}{число}{буква}" => "H453z"
        char letterBefore = code.charAt(0); //'H'
        char letterAfter = code.charAt(code.length() - 1); //'z'
        double number = Double.parseDouble(code.replace(letterBefore, ' ') //" 453z"
                                                .replace(letterAfter, ' ') //" 453 "
                                                .trim());                          //"453"

        //double number = Double.parseDouble(code.substring(1, code.length() - 1));
        //започваме да модифицираме числото спрямо буквите

        //1. модификация на числото спрямо буквата преди него -> letterBefore
        if (Character.isUpperCase(letterBefore)) {
            //главна буква -> А (65) до Z(90)
            int positionUpperLetter = (int) letterBefore - 64; //позицията на буквата в азбуката
            number /= positionUpperLetter;
            //number = number / positionUpperLetter;
        } else {
            //малка буква -> a (97) до z (122)
            int positionLowerLetter = (int) letterBefore - 96; //позиция на буквата в азбуката
            number *= positionLowerLetter;
            //number = number * positionLowerLetter;
        }

        //2. модификация на числото спрямо буквата след него -> letterAfter
        if (Character.isUpperCase(letterAfter)) {
            //главна буква -> А (65) до Z(90)
            int positionUpperLetter = (int) letterAfter - 64; //позицията на буквата в азбуката
            number -= positionUpperLetter;
            //number = number - positionUpperLetter;
        } else {
            //малка буква -> a (97) до z (122)
            int positionLowerLetter = (int) letterAfter - 96; //позиция на буквата в азбуката
            number += positionLowerLetter;
            //number = number + positionLowerLetter;
        }
        return number;
    }
}
