package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoSort {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(4, 12, 3, 9, 34, 23, 7, 56));

        //сортиране в нарастващ ред (ascending order) -> от най-малкото число до най-голямото число
        Collections.sort(numbers);

        //сортиране в намаляващ ред (descending order) -> от най-голямото число до най-малкото
        Collections.sort(numbers);
        Collections.reverse(numbers);
    }
}
