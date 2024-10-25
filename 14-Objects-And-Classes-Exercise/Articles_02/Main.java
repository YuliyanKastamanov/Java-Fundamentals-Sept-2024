package ObjectAndCassesExercise.Articles_02;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Articles newArticle = new Articles();

       //прочитаме входните данни
        //some title, some content, some author
        String [] articleData = scanner.nextLine().split(",");

        //създаваме променливи, в които запазваме входните данни
        String title = articleData[0];
        String content = articleData[1];
        String author = articleData[2];
        //създаваме обект от клас Articles -> title, content, author
        Articles articles = new Articles(title, content, author);

        //прочитаме колко на брой промени ще правим
        int countCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countCommands ; i++) {
            //прочитаме текущите данни, които трябва да се коригират
            String [] currentCommand = scanner.nextLine().split(":");

            //•	"Edit: {new content}"
            //•	"ChangeAuthor: {new author}"
            //•	"Rename: {new title}".

            switch (currentCommand[0]){
                //променяме съдържанието на статията
                case "Edit" -> articles.edit(currentCommand[1]);
                //променяме името на Автора на статията
                case "ChangeAuthor" -> articles.changeAuthor(currentCommand[1]);

                case "Rename" -> articles.rename(currentCommand[1]);

            }

        }

        System.out.println(articles);

    }
}
