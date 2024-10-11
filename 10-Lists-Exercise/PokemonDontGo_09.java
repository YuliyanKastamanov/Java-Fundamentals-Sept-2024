package List_Exercises;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class PokemonDontGo_09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<Integer> pokemonList = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int sumOfAllElements = 0;

        while (!pokemonList.isEmpty()){

            int index = Integer.parseInt(scanner.nextLine());

            if(index < 0){
                //вземаме стойността на 1-вия елемент -> index 0
                int removedElement = pokemonList.getFirst();
                //премахваме първия елемент
                pokemonList.removeFirst();
                //добавяме премахнатия елемент към сумата
                sumOfAllElements += removedElement;
                //вземаме последния елемент
                int lastElement = pokemonList.getLast();
                //поставяме на индекс 0
                pokemonList.addFirst(lastElement);

                modifyList(pokemonList, removedElement);

            } else if (index > pokemonList.size() - 1) {

                //вземаме последния елемент
                int lastElement = pokemonList.getLast();
                //премахваме последния елемент
                pokemonList.removeLast();//pokemonList.remove(pokemonList.size() - 1)
                //добавяме изтрития елемент към общата сума
                sumOfAllElements += lastElement;
                //вземаме 1-вия елемент
                int firstElement = pokemonList.getFirst();
                //добавяме 1-вия елемент на последна позиция
                pokemonList.add(firstElement);
                modifyList(pokemonList, lastElement);

            }else {// index >= 0 && index <= pokemonList.size() - 1

                //вземаме елемента, който искаме да изтрием
                int removedElement = pokemonList.get(index);
                //добавяме изтрития елемент към общата сума
                sumOfAllElements += removedElement;
                //премахваме елемента на посочения индекс
                pokemonList.remove(index);

                modifyList(pokemonList, removedElement);


            }


        }


        System.out.println(sumOfAllElements);

    }

    //моетод, който ще модифицира съществуващия списък с покемони
    private static void modifyList(List<Integer> pokemonList, int removedElement) {

        //{4, 3}
        for (int i = 0; i < pokemonList.size(); i++) {
            int currentElement = pokemonList.get(i);

            if(currentElement <= removedElement){
                currentElement += removedElement;
            }else {
                currentElement -= removedElement;
            }
            pokemonList.set(i, currentElement);
        }


    }
}
