package List_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Прочитаме списъка с вагони
        List<Integer> train = Arrays.stream(scanner.nextLine().split(" "))//"32 54 21 12 4 0 23"
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());//{32, 54, 21, 12, 4, 0, 23}

        //2. Прочитаме максималния капацитет пътници за всеки от вагоните
        int wagonMaxCapacity = Integer.parseInt(scanner.nextLine());

        //3. Прочитаме команда от конзолата ->
        //  -> •	Add {passengers} - add a wagon to the end with the given number of passengers
        //  -> •	{passengers} -  find an existing wagon to fit all the passengers (starting from the first wagon)
        //  -> •	"end"
        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());//{"Add", "10"}







        //Докато не получим команда "end" -> модифицираме списъка с вагони
        while (!command.get(0).equals("end")){
            //{32, 54, 21, 12, 4, 0, 23}
            //{"Add", "10"}
            if(command.get(0).equals("Add")){
                //Преобразуваме елемента на индекс 1 в число -> вагон с 10 човека, който добавяме накрая на списъка
                int wagonToAdd = Integer.parseInt(command.get(1));//10

                //Добавяме вагона с 10 човека към текущия списък
                train.add(wagonToAdd);//{32, 54, 21, 12, 4, 0, 23, 10}
            }else {
                //вземаме броя пътници, които искаме да се качат в даден вагон
                int passengersToAdd = Integer.parseInt(command.get(0));

                for (int i = 0; i < train.size(); i++) {
                    int finalPassCount = passengersToAdd + train.get(i);//30 + 32

                    if (finalPassCount <= wagonMaxCapacity){
                        train.add(i, finalPassCount);//{62, 32, 54, 21, 12, 4, 0, 23, 10}
                        train.remove(i + 1);//{62, 54, 21, 12, 4, 0, 23, 10}
                        break;
                    }

                }
            }

            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }

        System.out.println(train.toString().replaceAll("[\\[\\],]", ""));




    }
}
