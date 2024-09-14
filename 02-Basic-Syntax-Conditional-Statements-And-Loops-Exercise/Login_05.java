package BasicsRecap;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни
        String username = scanner.nextLine(); //потребителско име ->"Acer"

        //2. намираме паролата
        String password = ""; //парола -> "recA"

        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position); //символа на текущата позиция
            password += currentSymbol;
        }

        //Потебителски профил
        //потребителско име: username
        //парола: password

        //while цикъл
        //поватаряме: въвеждане на парола за вход
        //стоп: въведената парола == password -> влизаме в профила
        //продължаваме: въведената парола != password

        int countWrongPasswords = 0; //брой на въведените грешни пароли
        String enteredPassword = scanner.nextLine();
        while (!enteredPassword.equals(password)) {
            //грешна парола
            countWrongPasswords++;

            //1. проверка дали сме блокирали
            if (countWrongPasswords == 4) {
                //ПРОФИЛЪТ Е БЛОКИРАН
                System.out.printf("User %s blocked!", username);
                return; //прекратява цялата програма
            }

            //2. грешна парола + неблокиран профил -> ОПИТАЙ ОТНОВО
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }

        //вярна парола: enteredPassword == password
        System.out.printf("User %s logged in.", username);
    }
}
