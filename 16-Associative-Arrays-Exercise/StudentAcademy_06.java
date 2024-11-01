package Maps_Exercise;

import java.util.*;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //студент -> списък с оценки
        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();

        int countStudents = Integer.parseInt(scanner.nextLine());
        for (int count = 1; count <= countStudents; count++) {
            String studentName = scanner.nextLine(); //име на студента
            double grade = Double.parseDouble(scanner.nextLine()); //оценка

            //1. имаме вече записан такъв студент
            if (studentGrades.containsKey(studentName)) {
                List<Double> currentGrades = studentGrades.get(studentName);
                currentGrades.add(grade);
            }
            //2. нямаме записан такъв студент
            else {
                studentGrades.put(studentName, new ArrayList<>());
                studentGrades.get(studentName).add(grade);
            }
        }

        //studentGrades: име на студент -> списък с оценки

        Map<String, Double> studentAverageGrade = new LinkedHashMap<>();
        //studentAverageGrade: име на студент -> double

        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {
            //entry
            //entry.getKey -> име на студента
            //entry.getValue -> списък с оценки
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();
            double average = grades.stream().mapToDouble(d -> d).average().orElse(0.0);

            //съхраним студента и неговата средна оценка, само ако ср. оценка >= 4.50
            if (average >= 4.50) {
                studentAverageGrade.put(studentName, average);
            }

        }

        //studentAverageGrade: име на студент -> средна оценка
        //entry
        //entry.getKey -> име на студента
        //entry.getValue -> ср. оценка
        studentAverageGrade.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }
}
