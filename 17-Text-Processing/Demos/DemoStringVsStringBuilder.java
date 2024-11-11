package TextProcessing;

public class DemoStringVsStringBuilder {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            text.append("a");
            //text = text + "a"
        }
        System.out.println(text);

    }
}
