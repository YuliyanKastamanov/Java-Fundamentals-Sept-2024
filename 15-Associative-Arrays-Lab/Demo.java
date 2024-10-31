package AssociativeArrays;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Име на ученик, оценка
        // TreeMap - подреждат се по азбучен ред -> възходящ ред
        // LinkedHashMap - подреждат се спрямо реда на въвеждане
        // HashMap - подреждат се на случаен принцип

        Map<Integer, Student> students = new TreeMap<>();

        Student newStudent = new Student("Ivan", 14, 5.80);
        Student newStudent2 = new Student("Pavel", 15, 5.60);
        Student newStudent3 = new Student("Georgi", 12, 5.90);

        //1. Добавяне на елементи към MAP-а

        students.put(1, newStudent);
        students.put(2, newStudent2);
        students.put(3, newStudent3);

        /*students.put("Yuliyan", 3.50);//добавяме елемент в Мап-а с ключ: Yuliyan, стойност: 3.50
        students.put("Ivan", 5.80);
        students.put("Stoyan", 5.20);

        students.put("Yuliyan", 5.40);//презаписваме елемента с нова стойност*/

        System.out.println(students.size());

        List<Student> studentList = new ArrayList<>();

        //2.Премахване на елементи
        //students.remove(2);//премахваме елемента с ключ 2
        //students.remove("Ivan");
        students.remove(2, newStudent);

        //3. Проверка дали MAP-a е празен -> size = 0
        System.out.println(students.isEmpty());//true -> ако Map-a е празен, false -> ако имаме елементи

        //4. Изчистване на всички елементи от MAP-a
        students.clear();

        System.out.println(students.containsKey(5));// false
        System.out.println(students.containsKey(1));// true

        System.out.println(students.containsValue("Pavel"));//false
        System.out.println(students.containsValue(newStudent));//true







    }
}
