package Methods;

import java.util.Scanner;

public class Calculations_04 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String action = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());


        //("add", "multiply", "subtract", "divide"
        switch (action) {
            case "add" -> actionAdd(firstNum, secondNum);
            case "multiply" -> actionMultiply(firstNum, secondNum);
            case "subtract" -> actionSubtract(firstNum, secondNum);
            case "divide" -> actionDivide(firstNum, secondNum);
        }
    }

    private static void actionAdd(int firstNum, int secondNum) {

        System.out.println(firstNum + secondNum);

    }

    private static void actionMultiply(int firstNum, int secondNum) {

        System.out.println(firstNum * secondNum);

    }

    private static void actionSubtract(int firstNum, int secondNum) {

        System.out.println(firstNum - secondNum);

    }

    private static void actionDivide(int firstNum, int secondNum) {

        System.out.println(firstNum / secondNum);

    }


}
