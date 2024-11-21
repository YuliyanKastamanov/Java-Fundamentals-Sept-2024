package ExamPrep;

import java.util.Scanner;

public class SecretChat_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder concealedMessage = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();//както инструкция така и команда "Reveal"


        while (!command.equals("Reveal")){

            //намираме текущата команда, която искаме да изпълним
            //InsertSpace, Reverse, ChangeAll
            String[] currentData = command.split(":\\|:");
            String currentCommand = currentData[0];// получаваме действието, което трябва да извършим

            switch (currentCommand){

                case "InsertSpace" -> {
                    //вземаме индекса, на който ще поставим интервал
                    int index = Integer.parseInt(currentData[1]);
                    //поставяме интервал на конкретния индекс
                    concealedMessage.insert(index, " ");//abcdefabc -> 2
                    System.out.println(concealedMessage);
                }

                case "Reverse" -> {
                    StringBuilder substring = new StringBuilder(currentData[1]);
                    //Reverse:|:{substring}

                    //проверяваме дали нашето съобщение съдържа текста, който искаме да завъртим
                    if (!concealedMessage.toString().contains(substring)){
                        //ако текста не се съдържа в нашето съобщение принтираме error
                        System.out.println("error");
                    }else {
                        //abcdefabc
                        //abc
                        //за да изтрием първото срещане на нашия substring имаме нужда от първия и последния индекс
                        int firstIndex = concealedMessage.indexOf(substring.toString());//0
                        int lastIndex = firstIndex + substring.length();//3
                       // int number = concealedMessage.lastIndexOf(substring.toString()) + 1;
                        //завъртаме нашия substring -> cba
                        String reversedString = substring.reverse().toString();
                        //изтриваме събстринга при първото му срещане
                        concealedMessage.delete(firstIndex, lastIndex);
                        //добавяме обърнатия substring
                        concealedMessage.append(substring);
                        System.out.println(concealedMessage);

                    }
                }

                case "ChangeAll" -> {
                    String substringToReplace = currentData[1];
                    String replacement = currentData[2];

                    //String newMessage = concealedMessage.toString().replace(substringToReplace, replacement);

                    while (concealedMessage.toString().contains(substringToReplace)){
                        int firstIndex = concealedMessage.indexOf(substringToReplace);
                        int lastIndex = firstIndex + substringToReplace.length();
                        concealedMessage.replace(firstIndex, lastIndex, replacement);
                    }
                    System.out.println(concealedMessage);

                }
            }
            command = scanner.nextLine();
        }


        System.out.println("You have a new text message: " + concealedMessage);


    }
}
