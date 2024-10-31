package AssociativeArrays;

import java.util.*;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //прочитаме си масива с числа от конзолат -> [8, 2, 2, 8, 2]
        double[] numbersArray = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        //създаваме си празем МАП -> ключ реално число, стойност - цяло число
        Map<Double, Integer> numbersMap = new TreeMap<>();

        //преминаваме през всяко число от масива
        for (double num : numbersArray){

            //проверяваме дали нашият MAP-съдържа конкретното число като ключ
            if(!numbersMap.containsKey(num)){
                numbersMap.put(num, 1);
            }else {
                /*int occurrences = numbersMap.get(num);// получаваме стойността(value), която стои срещу съответния ключ
                occurrences++;
                numbersMap.put(num, occurrences);*/

                numbersMap.put(num, numbersMap.get(num) + 1);
            }

        }

        for (Map.Entry<Double, Integer> entry: numbersMap.entrySet()){

            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
