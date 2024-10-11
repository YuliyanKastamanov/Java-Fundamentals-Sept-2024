package List_Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());//"1 2 3 |4 5 6 |  7  8" -> {"1 2 3 ", "4 5 6 ", "  7  8"}

        Collections.reverse(input);//{"  7  8", "4 5 6 ", "1 2 3 "}

        System.out.println(input.toString()//["  7  8", "4 5 6 ", "1 2 3 "]
                .replace("[", "")//"  7  8", "4 5 6 ", "1 2 3 "]
                .replace("]", "")//["  7  8", "4 5 6 ", "1 2 3 "
                .replaceAll(",", "")//"  7  8" "4 5 6 " "1 2 3 "
                .replaceAll("\\s+", " ")
                .trim());//7  8 4 5 6  1 2 3



    }
}
