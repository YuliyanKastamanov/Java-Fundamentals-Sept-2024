package List_Exercises;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                //"1 10 20 10" -> ["1", "10", "20", "10"]
                .map(Integer::parseInt)//[1, 10, 20, 10]
                .collect(Collectors.toList());// {1, 10, 20, 10}






    }
}
