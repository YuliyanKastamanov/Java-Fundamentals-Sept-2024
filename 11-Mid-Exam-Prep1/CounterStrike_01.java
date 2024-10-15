package MidExamPrep;

import java.util.Scanner;

public class CounterStrike_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        boolean notEnoughEnergy = false;

        int countWonBattles = 0;
        while (!command.equals("End of battle")){

            int distance = Integer.parseInt(command);



            /*if(initialEnergy < 0){
                initialEnergy += distance;
                notEnoughEnergy = true;
                break;*/
            if(initialEnergy >= distance) {
                initialEnergy -= distance;
                countWonBattles ++;
            }else {
                notEnoughEnergy = true;
                break;
            }




            if(countWonBattles % 3 == 0){
                initialEnergy += countWonBattles;
            }

            command = scanner.nextLine();
        }


        if(notEnoughEnergy){
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", countWonBattles, initialEnergy);
        }else {
            System.out.printf("Won battles: %d. Energy left: %d", countWonBattles, initialEnergy);
        }


    }
}
