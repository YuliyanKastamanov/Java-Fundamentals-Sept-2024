package ExamPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HeroesOfCodeAndLogicVII_SecondExample {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfHeroes = Integer.parseInt(scanner.nextLine());

        Map<String, HeroesData> heroes = new LinkedHashMap<>();

        for (int i = 0; i < numberOfHeroes; i++) {
            String[] heroData = scanner.nextLine().split("\\s+");
            String currentHero = heroData[0];
            int currentHitPoints = Integer.parseInt(heroData[1]);
            int currentManaPoints = Integer.parseInt(heroData[2]);
            if (currentHitPoints > 100){
                currentHitPoints = 100;
            }
            if (currentManaPoints > 200){
                currentManaPoints = 200;
            }
            HeroesData newHeroData = new HeroesData(currentHitPoints, currentManaPoints);
            heroes.put(currentHero, newHeroData);

        }

        String command = scanner.nextLine();

        while (!command.equals("End")){

            String[] tokens = command.split(" - ");
            String currentCommand = tokens[0];
            String heroName = tokens[1];

            switch (currentCommand){
                case "CastSpell":
                    int neededMP = Integer.parseInt(tokens[2]);
                    String spellName = tokens[3];
                    int currentMP = heroes.get(heroName).getManaPoints();
                    int manaPointsLeft = currentMP - neededMP;
                    if(manaPointsLeft >= 0){
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, manaPointsLeft);
                        heroes.get(heroName).setManaPoints(manaPointsLeft);
                    }else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;

                case "TakeDamage":
                    int damage = Integer.parseInt(tokens[2]);
                    String attacker = tokens[3];
                    int currentHitPoints = heroes.get(heroName).getHitPoints();
                    int hitPointsLeft = currentHitPoints - damage;
                    if (hitPointsLeft > 0){
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, hitPointsLeft);
                        heroes.get(heroName).setHitPoints(hitPointsLeft);
                    }else {
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                        heroes.remove(heroName);
                    }
                    break;

                case "Recharge":
                    int amountMP = Integer.parseInt(tokens[2]);
                    int manaPowerToAmount = heroes.get(heroName).getManaPoints();
                    int finalMP = amountMP + manaPowerToAmount;
                    if (finalMP>200){
                        heroes.get(heroName).setManaPoints(200);
                        amountMP = 200 - manaPowerToAmount;
                    }else {
                        heroes.get(heroName).setManaPoints(finalMP);
                    }

                    System.out.printf("%s recharged for %d MP!%n", heroName, amountMP);

                    break;
                case "Heal":
                    int amountHP = Integer.parseInt(tokens[2]);
                    int hitPowerToAmount = heroes.get(heroName).getHitPoints();
                    int finalHP = amountHP + hitPowerToAmount;
                    if (finalHP>100){
                        heroes.get(heroName).setHitPoints(100);
                        amountHP = 100 - hitPowerToAmount;
                    }else {
                        heroes.get(heroName).setHitPoints(finalHP);
                    }
                    System.out.printf("%s healed for %d HP!%n", heroName, amountHP);
                    break;
            }

            command = scanner.nextLine();
        }
        heroes.entrySet().stream()
                //.sorted((e1, e2) -> Integer.compare(e2.getValue().getHitPoints(), e1.getValue().getHitPoints()))
                .forEach(entry -> {
                    System.out.printf("%s%n", entry.getKey());
                    System.out.printf("  HP: %d%n", entry.getValue().getHitPoints());
                    System.out.printf("  MP: %d%n", entry.getValue().getManaPoints());
                });

    }

}

class HeroesData{

    private int hitPoints;
    private int manaPoints;

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public HeroesData(int hitPoints, int manaPoints) {
        this.hitPoints = hitPoints;
        this.manaPoints = manaPoints;
    }
}