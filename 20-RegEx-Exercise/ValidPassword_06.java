package RegEx_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "_\\.+(?<password>[A-Z][A-Za-z0-9]{4,}[A-Z])_\\.+";
        Pattern pattern = Pattern.compile(regex);

        //прочитаме броя пароли
        int countPasswords = Integer.parseInt(scanner.nextLine());

        //минаваме през всяка от паролите
        for (int i = 1; i <= countPasswords ; i++) {
            String password = scanner.nextLine();

            //вземаме конкретната парола и проверяваме дали имаме съвпадение
            Matcher matcher = pattern.matcher(password);

            if(matcher.find()){
                //matcher = "_...ChelseA_."
                String validPassword = matcher.group("password");

                //създаваме StringBuilder, в който ще запазим групата/категоризацията на паролата
                StringBuilder concatenatedDigits = new StringBuilder();

                for (char symbol : validPassword.toCharArray()){
                    if(Character.isDigit(symbol)){
                        concatenatedDigits.append(symbol);
                    }
                }

                if(concatenatedDigits.isEmpty()){
                    System.out.println("Group: default");
                }else{
                    System.out.println("Group: " + concatenatedDigits);
                }

            }else {
                //matcher.find() -> false
                System.out.println("Invalid pass!");
            }



        }





    }
}
