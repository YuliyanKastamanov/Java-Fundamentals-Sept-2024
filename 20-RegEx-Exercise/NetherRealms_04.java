package RegEx_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] demonNames = scanner.nextLine() //"M3ph1st0**,     Azazel" -> M3ph1st0**,Azazel -> ["M3ph1st0**", "Azazel"]
                .replace(" ", "")// "M3ph1st0**,Azazel"
                .split(",");//["M3ph1st0**", "Azazel"]

        for (String demonName : demonNames){

            int health = calculateHealth(demonName);

            double damage = calculateDamage(demonName);

            //модифицираме стойността на damage -> спрямо името на демона -> ако съдържа * умножаваме 2, ако съдържа / делим на 2
            for (char symbol : demonName.toCharArray()){
                if(symbol == '*'){
                    damage *= 2;
                }else if (symbol == '/'){
                    damage /= 2;
                }
            }

            System.out.printf("%s - %d health, %.2f damage\n", demonName, health, damage);

        }



    }

    private static double calculateDamage(String demonName) {

        double damage = 0;
        //получаваме всички дробни и цели числа, които са положителни и отрицателни
        String regex = "[-]?[0-9]+\\.?[0-9]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(demonName);
        //demonName = M3ph-0.5s-0.5t0.0**
        //matcher = ["3", "-0.5", "-0.5", "0.0"]

        while (matcher.find()){
            double currentDamage = Double.parseDouble(matcher.group());
            damage += currentDamage;
        }

        return damage;

    }

    private static int calculateHealth(String demonName) {

        int health = 0;

        for (char currentSymbol : demonName.toCharArray()){

            if(currentSymbol != '+' && currentSymbol != '-' && currentSymbol != '*' && currentSymbol != '/'
            && currentSymbol != '.' && !Character.isDigit(currentSymbol)){
                health += currentSymbol;
            }


        }

        return health;
    }
}
