package AssociativeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] words = Arrays.stream(scanner.nextLine().split("\\s+"))// ["kiwi", "orange", "banana", "apple"]
                .filter(word -> word.length() % 2 == 0)
                .toArray(String[]::new);

        /*for (int i = 0; i < words.length; i++) {

        }*/

        Arrays.stream(words).forEach(word -> System.out.println(word));

        /*
        for (String word : words){
            System.out.println(word);
        }*/


    }
}
