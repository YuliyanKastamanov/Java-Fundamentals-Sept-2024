package DataTypesAndVariables;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* byte counter = 0;
        for (int i = 0; i < 130; i++) {
            counter++;
            System.out.println(counter);
        }

        //създаваме обект/променлива
        BigDecimal number = new BigDecimal(0);
        BigInteger intNumber = new BigInteger("10");
*/

        //1. .add() -> събиране
        //number = number.add(BigDecimal.valueOf(2.5));
        //2. subtract -> изваждане
        //number = number.subtract(BigDecimal.valueOf(1.5));
        //3. multiply -> умножение
        //number = number.multiply(BigDecimal.valueOf(2));
        //4. devide -> разделя
        //number = number.divide(BigDecimal.valueOf(2));

        //Type conversion
        //1. Имплицитно Implicit - не губим данни -> от по-малък тип данни към по-голям
        //2. Експлицитно Explicit - имаме загуба на данни -> от по-голям тип конвертираме в по-малък
/*

        char symbol1 = 'c';
        char symbol2 = 'd';

        System.out.println("I am \"Yuliyan\"");*/
        //System.out.println((int) symbol1);
        //System.out.println(symbol1 + symbol2);

        byte byteNumber = Byte.parseByte(scanner.nextLine());

        System.out.println(byteNumber);


    }
}
