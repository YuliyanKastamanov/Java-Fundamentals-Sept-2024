package ListsLab;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        //List -> структура от данни, в която съхраняваме съвкупност от еднотипни елементи

        //създаване на празен лист / списък
        //от цели числа
        List<Integer> integerList = new ArrayList<>(3);
        //от дробни числа
        List<Double> decimalList = new ArrayList<>();
        //от текстове
        List<String> stringList = new ArrayList<>();
        //от символи
        List<Character> charList = new ArrayList<>();

        //добавяне на елементи в края на списъка
        integerList.add(45); //добавя елемента в края на листа
        integerList.add(57);
        integerList.add(12);
        integerList.add(4);

        decimalList.add(5.60);
        decimalList.add(5.00);

        stringList.add("Desi");
        stringList.add("Table");

        charList.add('y');

        //добавяне / вмъкване на елементи на конкретна позиция
        //integerList = {45, 57, 12, 4};
        integerList.add(1, 34);
        //integerList = {45, 34, 57, 12, 4}

        //размер на листа = колко е броя на елементите в листа
        System.out.println(integerList.size());
        System.out.println(decimalList.size());
        System.out.println(stringList.size());
        int size = charList.size();
        System.out.println(size);

        //създаваме списък с предварително дефинирани елементи
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));

        //!!! премахваме елемент от списък с цели числа
        numbers.remove(Integer.valueOf(40)); //премахва стойността на елемента
        numbers.remove(2); //премахва елемент от позиция 2

        //премахваме елемент от списък с дробни / текстове / символи
        decimalList.remove(5.60); //премахваме от списъка елемента 5.60
        decimalList.remove(1); //премахваме елемента на първа позиция

        stringList.remove("Desi"); //премахваме от списъка елемента "Desi"
        stringList.remove(0); //премахваме елемента на нулева позиция

        //замяна на елемент в списъка
        List<String> names = new ArrayList<>(Arrays.asList("Desi", "Valentin", "Rosen", "Petya"));
        names.set(1, "Ivan");
        //names = {"Desi", "Ivan", "Rosen", "Petya"}

        //достъпва елемент от конкретна позиция в списъка
        String name = names.get(1);
        System.out.println(names.get(2));

        //проверка дали даден елемент присъства в списъка
        //contains
        //true -> ако елементът го има в списъка
        //false -> ако елементът го няма в списъка
        System.out.println(names.contains("Peter"));
        boolean isContaining = names.contains("Ivan");
        System.out.println(isContaining);

        //обхождане на лист
        List<Double> grades = new ArrayList<>(Arrays.asList(5.60, 4.50, 3.45, 5.12));
        //1. for цикъл -> имаме нужда да знаем на коя позиция се намира всеки един елемент
        for (int position = 0; position <= grades.size() - 1; position++) {
            double grade = grades.get(position);
            System.out.println(grade);
            if (position % 2 == 0) {
                System.out.println("even position");
            }
        }
        //2. foreach -> имаме нужда само от елементите в листа без техните позиции
        for (double grade : grades) {
            System.out.println(grade);
        }

        //премахване на всички елементи в списъка
        //grades = {5.60, 4.50, 3.45, 5.12}
        System.out.println(grades.size()); //4
        grades.clear();
        //grades = {}
        System.out.println(grades.size()); //0

        //проверка за празен списък (размерът му е равен на 0 = няма елементи в него)
        //isEmpty
        //true -> списъкът е празен, size == 0
        //false -> списъкът не е празен, size > 0
        System.out.println(numbers.isEmpty());

        //намиране на позицията на елемент
        List<Integer> codes = new ArrayList<>(Arrays.asList(34, 12, 15, 87));
        //codes = {34, 12, 15, 87}
        int position = codes.indexOf(12); //1
        System.out.println(codes.indexOf(15)); // 2
        System.out.println(codes.indexOf(34)); // 0
        System.out.println(codes.indexOf(123)); // -1 -> няма такъв елемент в списъка




    }
}
