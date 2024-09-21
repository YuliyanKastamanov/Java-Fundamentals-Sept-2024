package DataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short maxLiters = 255; //максимално количество литри, които можем да налеем във варела
        int currentLiters = 0; //текущите литри във варела
        int count = Integer.parseInt(scanner.nextLine()); //колко пъти се налива вода във варела


        for (int i = 1; i <= count; i++) {
            int pouredLiters = Integer.parseInt(scanner.nextLine()); //колко литра вода наливаме във варела всеки път

            //наливане
            currentLiters += pouredLiters;

            //проверка дали не сме преляли
            if (currentLiters > maxLiters) {
                //преляли варела
                System.out.println("Insufficient capacity!");
                //премахваме водата, която сме наляли и е преляла
                currentLiters -= pouredLiters;
            }
        }

        System.out.println(currentLiters);
    }
}
