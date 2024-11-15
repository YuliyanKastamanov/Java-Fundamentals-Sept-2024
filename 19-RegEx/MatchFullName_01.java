package RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName_01 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "\\b(?<firstName>[A-Z][a-z]+) (?<lastName>[A-Z][a-z]+)\\b";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            String currentName = matcher.group() + " ";
            System.out.print(currentName);
        }
    }
}
