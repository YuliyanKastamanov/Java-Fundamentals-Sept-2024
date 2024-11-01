package Maps_Exercise;

import java.util.*;

public class CountCharsInString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //HashMap -> подредбата на записите не е гарантирана
        //LinkedHashMap -> подредбата на записите зависи от реда на добавяне
        //TreeMap -> подредбата на записите зависи от ключа на всеки запис

        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();
        //запис: буква -> бр. срещания

        //input = "Desi"
        //input.toCharArray() -> ['D', 'e', 's', 'i']
        for (char symbol : input.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if (!symbolsCount.containsKey(symbol)) {
                //не сме срещали такъв символ
                symbolsCount.put(symbol, 1);
            } else {
                //вече сме срещали такъв символ
                int currentCount = symbolsCount.get(symbol);
                symbolsCount.put(symbol, currentCount + 1);
            }
        }

        //symbolsCount: символ -> бр. срещания
        for (Map.Entry<Character, Integer> entry : symbolsCount.entrySet()) {
            //entry -> всеки един запис
            //entry.getKey() -> символ
            //entry.getValue() -> бр. срещания
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
