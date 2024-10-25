package ObjectAndCassesExercise.OpinionPoll_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 1; i <= countPeople ; i++) {

            String[] data = scanner.nextLine().split("\\s+");
            String currentName = data[0];
            int currentAge = Integer.parseInt(data[1]);

            if(currentAge > 30){
                Person currentPerson = new Person(currentName, currentAge);
                people.add(currentPerson);
            }

        }

        for (Person currentPerson : people){
            System.out.println(currentPerson.getName() + " - " + currentPerson.getAge());
        }


    }
}
