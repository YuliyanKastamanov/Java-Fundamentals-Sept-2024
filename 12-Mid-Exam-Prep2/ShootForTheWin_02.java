package MidExamPrep;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //входни данни
        int[] targets = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt).toArray(); //мишени и техните стойности
        //targets = [24, 50, 36, 70]

        int countShotTargets = 0; //брой на уцелените мишени

        String input = scanner.nextLine(); //"End" или позиция под формата на текст

        while (!input.equals("End")) {
            //input = "1"
            int shotPosition = Integer.parseInt(input); //позицията на мишената, по която искам да стрелям

            //проверка на позицията, която ще стрелям
            //валидна: [0; дължина - 1]
            if (shotPosition >= 0 && shotPosition <= targets.length - 1) {
                //можем да целим мишена
                //1. взимаме стойността на мишената, която целим
                int valueShotTarget = targets[shotPosition];

                //2. променяме всички други мишени спрямо тази която целим
                for (int position = 0; position <= targets.length - 1; position++) {
                    int currentTargetValue = targets[position]; //стойността на текущата мишена
                    //не променяме:
                    // 1. моята, която предстои да целя
                    // 2. са вече уцелени (== -1)
                    if (currentTargetValue != -1 && position != shotPosition) {
                        //мога да променям дадена мишена
                        if (currentTargetValue > valueShotTarget) {
                            currentTargetValue -= valueShotTarget;
                        } else {
                            //currentTargetValue <= valueShotTarget
                            currentTargetValue += valueShotTarget;
                        }
                        //след промяната на стойността -> слагаме променената стойност
                        targets[position] = currentTargetValue;
                    }
                }

                //3. целим директно нашата мишена
                targets[shotPosition] = -1;
                countShotTargets++;
            }
            input = scanner.nextLine();
        }

        //Отпечатавме: "{target1} {target2}… {targetn}"
        System.out.print("Shot targets: " + countShotTargets + " -> ");
        for (int target : targets) {
            System.out.print(target + " ");
        }
    }
}
