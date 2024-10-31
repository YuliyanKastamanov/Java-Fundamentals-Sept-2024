package AssociativeArrays;

import java.util.*;

public class WordSynonyms_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> words = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            words.putIfAbsent(word, new ArrayList<>());
            words.get(word).add(synonym);//получаваме списъка със синомити

        }

        for (Map.Entry<String, List<String>> wordEntry : words.entrySet()){
            String currentWord = wordEntry.getKey();
            List<String> synonymsForCurrentWord = wordEntry.getValue();
            System.out.printf("%s - %s%n", currentWord, String.join(", ", synonymsForCurrentWord));

        }
    }
}
