package students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //държим основната логика на задачата -> входни данни, изходни данни и др. действия

        List<Student> studentList = new ArrayList<>();

        String input = scanner.nextLine(); //входни данни: информация за студент
        while (!input.equals("end")) {
            //input = "John Smith 15 Plovdiv"
            String[] data = input.split(" "); //["John", "Smith", "15", "Plovdiv"]
            String firstName = data[0]; //"John"
            String lastName = data[1]; //"Smith"
            int age = Integer.parseInt(data[2]); //"15" -> parseInt -> 15
            String hometown = data[3]; //"Plovdiv"

            Student student = new Student(firstName, lastName, age, hometown);
            studentList.add(student);

            input = scanner.nextLine();
        }

        //получаваме името на града, който търсим
        String searchedTown = scanner.nextLine();

        //отпечатвам информация само за студентните от списъка, на които родния град е въведения в searchedTown
        for (Student student : studentList) {
            //object student
            //firstName:
            //lastName:
            //age:
            //hometown:
            if (student.getHometown().equals(searchedTown)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }

    }
}
