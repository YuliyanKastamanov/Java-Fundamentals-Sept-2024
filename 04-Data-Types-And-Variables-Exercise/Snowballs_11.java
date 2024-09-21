package DataTypes_Exercise;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBalls = Integer.parseInt(scanner.nextLine()); //брой на снежните топки
        double maxSnowballValue = 0; //максимално value
        int maxSnowballSnow = 0; //най-добрата топка snow
        int maxSnowballTime = 0; //най-добрата топка time
        int maxSnowballQuality = 0; //най-добрата топка quality

        for (int ball = 1; ball <= countBalls; ball++) {
            //информация за топката -> snow, time, quality
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            //изчислим snowballValue = (snowballSnow / snowballTime) ^ snowballQuality
            double snowballValue = Math.pow(snowballSnow / snowballTime, snowballQuality);

            //проверка дали топката е най-добрата
            if (snowballValue > maxSnowballValue) {
                //текущата топка е най-голяма
                maxSnowballValue = snowballValue;
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality;
            }

        }

        //обходили сме всички снежни топки -> отпечатваме най-добрата
        System.out.printf("%d : %d = %.0f (%d)", maxSnowballSnow, maxSnowballTime, maxSnowballValue, maxSnowballQuality);

    }
}
