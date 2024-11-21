package ExamPrep;

import java.util.*;

public class HeroesOfCodeAndLogicVII_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //прочитаме броя на героите
        int numberOfHeroes = Integer.parseInt(scanner.nextLine());

        //създаваме MAP, в който да запазваме героите
        Map<String, List<Integer>> heroes = new LinkedHashMap<>();

        //създаваме цилък, за да можем да си прочетем имената и точките на героите
        for (int i = 1; i <= numberOfHeroes ; i++) {

            //"{hero name} {HP} {MP}"
            String [] heroData = scanner.nextLine().split("\\s+");
            String currentHeroName = heroData[0];// Име на героя
            int currentHitPoints = Integer.parseInt(heroData[1]);//hit points
            int currentManaPoints = Integer.parseInt(heroData[2]);// mana points

            //проверяваме колко са текущите точки за герой
            if(currentHitPoints > 100){
                currentHitPoints = 100;
            }

            if(currentManaPoints > 200){
                currentManaPoints = 200;
            }

            //създаваме списък, в който да запазим точките за конкретен герой
            List<Integer> currentHeroPoints = new ArrayList<>();
            //hit points -> index 0
            currentHeroPoints.add(currentHitPoints);
            //mana points -> index 1
            currentHeroPoints.add(currentManaPoints);
            heroes.put(currentHeroName, currentHeroPoints);

        }

        String command = scanner.nextLine();

        while (!command.equals("End")){
            //сплитваме командата
            String [] commandData = command.split(" - ");

            //Вземаме името на командата
            String currentCommand = commandData[0];
            //Вземаме името на героя
            String heroName = commandData[1];

            //CastSpell, TakeDamage, Recharge, Heal
            switch (currentCommand){
                case "CastSpell" -> {
                    //CastSpell – {hero name} – {MP needed} – {spell name}
                    //вземаме необходимите, mana points, за атака
                    int neededMP = Integer.parseInt(commandData[2]);
                    //вземаме името на опонента
                    String spellName = commandData[3];
                    //вземаме текущите mana points на нашия герой
                    int currentHeroMP = heroes.get(heroName).get(1);
                    //изчисляваме колко mana points остават след атаката
                    int manaPointsLeft = currentHeroMP - neededMP;

                    //проверяваме дали можем да атакува
                    if(manaPointsLeft >= 0){
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, manaPointsLeft);
                        //премахваме първоначалните mana points и добяваме тези, които са останали
                        heroes.get(heroName).remove(1);
                        heroes.get(heroName).add(manaPointsLeft);
                    }else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                }
                case "TakeDamage" -> {

                    //TakeDamage – {hero name} – {damage} – {attacker}
                    int damage = Integer.parseInt(commandData[2]);
                    String attacker = commandData[3];
                    //вземаме колко hit points има нашият герой
                    int currentHeroHitPoint = heroes.get(heroName).get(0);
                    //изчисляваме колко hit points са ни останали след атаката
                    int hitPointsLeft = currentHeroHitPoint - damage;

                    //проверяваме дали героят има останали hit points
                    if(hitPointsLeft > 0){
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, hitPointsLeft);
                        heroes.get(heroName).remove(0);//премахваме първаначалните hit points
                        heroes.get(heroName).add(0, hitPointsLeft);//добавяме hit points, които са ни останали -> index 0, защото там съхраняваме hit points

                    }else {
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                        heroes.remove(heroName);
                    }

                }
                case "Recharge" -> {

                    //Recharge – {hero name} – {amount}
                    int amountMP = Integer.parseInt(commandData[2]);
                    int currentHeroMP = heroes.get(heroName).get(1);//вземаме текущите mana points, Които има нашият герой
                    int finalMP = amountMP + currentHeroMP;

                    if(finalMP > 200){
                        finalMP = 200;
                        amountMP = 200 - currentHeroMP;
                    }
                    heroes.get(heroName).remove(1);
                    heroes.get(heroName).add(finalMP);
                    System.out.printf("%s recharged for %d MP!%n", heroName, amountMP);

                }
                case "Heal" ->{

                    //Heal – {hero name} – {amount}
                    int amountHP = Integer.parseInt(commandData[2]);
                    int currentHeroHP = heroes.get(heroName).get(0);//вземаме текущите hit points, Които има нашият герой
                    int finalHP = amountHP + currentHeroHP;

                    if(finalHP > 100){
                        finalHP = 100;
                        amountHP = 100 - currentHeroHP;
                    }

                    heroes.get(heroName).remove(0);
                    heroes.get(heroName).add(0, finalHP);
                    System.out.printf("%s healed for %d HP!%n", heroName, amountHP);

                }
            }


            command = scanner.nextLine();
        }


        heroes.entrySet().stream()
                .forEach(entry -> {
                    System.out.println(entry.getKey());
                    System.out.printf("  HP: %d%n", entry.getValue().get(0));
                    System.out.printf("  MP: %d%n", entry.getValue().get(1));
                });







    }
}
