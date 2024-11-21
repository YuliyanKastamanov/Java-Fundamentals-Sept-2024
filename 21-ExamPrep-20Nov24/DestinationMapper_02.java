package ExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "([\\=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int points = 0;
        List<String> destinations = new ArrayList<>();

        while (matcher.find()){
            String currentDestination = matcher.group("destination");
            int currentPoints = currentDestination.length();
            points += currentPoints;
            destinations.add(currentDestination);
        }

        System.out.println("Destinations: " + String.join(", ", destinations));
        System.out.printf("Travel Points: %d", points);



    }
}
