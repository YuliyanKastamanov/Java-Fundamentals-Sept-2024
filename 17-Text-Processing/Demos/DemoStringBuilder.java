package TextProcessing;

public class DemoStringBuilder {
    public static void main(String[] args) {
        //създаване на StringBuilder
        StringBuilder sb = new StringBuilder();

        //append -> добавяне на текст в sb
        sb.append("I am");
        sb.append(" Desislava Topuzakova ");
        sb.append("26 years old.");
        sb.append("I am Ivan Ivanov").append(" from Sofia ").append(".");

        //дължина на sb = броя на символите на текста в sb
        System.out.println(sb.length());

        //изпразване на sb
        sb.setLength(0);

        //достъпваме символи в текста в sb
        System.out.println(sb.charAt(0));

        //вмъкваме текст в sb
        sb.insert(0, "Hello");

        //достъпваме текста в sb
        String text = sb.toString();
        System.out.println(sb.toString());

        //обръщаме на обратно текста в sb
        sb.reverse();

        //substring при sb и String е един и същ
        String name = sb.substring(0, 11);
    }
}
