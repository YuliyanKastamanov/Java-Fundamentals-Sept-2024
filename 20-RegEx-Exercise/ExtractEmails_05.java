package RegEx_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        //{user}@{host}
        //yuliyan.kastamanov@gmail.com
        String regexUser = "[A-Za-z0-9]+[\\.\\-\\_]?[A-Za-z0-9]+";
        String regexHost = "[A-Za-z]+\\-?[A-Za-z]+(\\.[A-Za-z]+\\-?[A-Za-z]*)+";//mail.softuni.org
        String regexEmail = regexUser + "@" + regexHost;// пълният регекс за верификация на имейл

        Pattern pattern = Pattern.compile(regexEmail);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
