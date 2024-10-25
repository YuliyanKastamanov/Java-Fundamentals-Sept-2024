package ObjectAndCassesExercise.Students_04;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();

        for (int i = 1; i <= countStudents ; i++) {
            String [] studentData = scanner.nextLine().split("\\s+");

            //Lakia Eason 3.90
            String currentStudentFirstName = studentData[0];//Lakia
            String currentStudentSecondName = studentData[1];//Eason
            double currentStudentGrade = Double.parseDouble(studentData[2]);//3.90

            Student currentStudent = new Student(currentStudentFirstName, currentStudentSecondName, currentStudentGrade);

            students.add(currentStudent);


        }

        students.sort(Comparator.comparing(Student::getGrade));
        Collections.reverse(students);

        //todo print students list

    }
}
