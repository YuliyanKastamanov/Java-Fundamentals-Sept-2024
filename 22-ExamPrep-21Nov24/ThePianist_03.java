package ExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3 {
    public static <KeyValuePair> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //пиеса -> композитор
        Map<String, String> piecesCompositors = new LinkedHashMap<>();

        //пиеса -> тоналност
        Map<String, String> piecesKeys = new LinkedHashMap<>();

        //1. съхраняваме информацията за всички пиеси
        int countPieces = Integer.parseInt(scanner.nextLine()); //брой на пиеси

        for (int count = 1; count <= countPieces; count++) {
            String pieceData = scanner.nextLine(); //"Fur Elise|Beethoven|A Minor"
            String[] pieceParts = pieceData.split("\\|"); //["Fur Elise", "Beethoven", "A Minor"]

            String pieceName = pieceParts[0]; //име на пиеса - "Fur Elise"
            String pieceComposer = pieceParts[1]; //композитора - "Beethoven"
            String pieceKey = pieceParts[2]; //тоналност - "A Minor"

            //съхранявам информацията за пиесата
            piecesCompositors.put(pieceName, pieceComposer);
            piecesKeys.put(pieceName, pieceKey);

        }

        //2. чрез команди си модифицираме пиесите и данните за тях
        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            String[] commandParts = command.split("\\|");
            String commandName = commandParts[0]; //"Add", "Remove", "ChangeKey"
            String pieceName = commandParts[1]; //име на пиеса

            //проверка коя команда е въведена
            if (commandName.equals("Add")) {
                //command = "Add|{piece}|{composer}|{key}".split("|") -> commandParts = ["Add", "{piece}", "{composer}", "{key}"]
                String pieceComposer = commandParts[2];
                String pieceKey = commandParts[3];
                //проверка имаме ли такава пиеса
                if (piecesCompositors.containsKey(pieceName) && piecesKeys.containsKey(pieceName)) {
                    //имаме такава пиеса
                    System.out.printf("%s is already in the collection!%n", pieceName);
                } else {
                    //нямаме такава пиеса
                    piecesCompositors.put(pieceName, pieceComposer);
                    piecesKeys.put(pieceName, pieceKey);
                    System.out.printf("%s by %s in %s added to the collection!%n", pieceName, pieceComposer, pieceKey);
                }
            } else if (commandName.equals("Remove")) {
                //command = "Remove|{piece}".split("|") -> commandParts = ["Remove", "{piece}"]
                //проверка имаме ли такава пиеса
                if (piecesCompositors.containsKey(pieceName) && piecesKeys.containsKey(pieceName)) {
                    //такава пиеса имаме -> премахваме
                    piecesCompositors.remove(pieceName);
                    piecesKeys.remove(pieceName);
                    System.out.printf("Successfully removed %s!%n", pieceName);
                } else {
                    //такава пиеса нямаме -> не я премахваме
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceName);
                }
            } else if (commandName.equals("ChangeKey")) {
                //command = "ChangeKey|{piece}|{new key}".split("|")  -> commandParts = ["ChangeKey", "{piece}", "{newKey}"]
                String newKey = commandParts[2]; //нова тоналност
                //проверка имаме ли такава пиеса
                if (piecesCompositors.containsKey(pieceName) && piecesKeys.containsKey(pieceName)) {
                    //такава пиеса имаме -> променяме тоналността ѝ
                    piecesKeys.put(pieceName, newKey);
                    System.out.printf("Changed the key of %s to %s!%n", pieceName, newKey);
                } else {
                    //такава пиеса нямаме -> не променяме тоналността
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceName);
                }
            }
            command = scanner.nextLine();
        }

        //3. отпечатване
        for (Map.Entry<String, String> entry : piecesCompositors.entrySet()) {
            //entry
            //entry.Key -> име на пиеса
            //entry.Value -> композитор
            String piece = entry.getKey();
            String compositor = entry.getValue();
            String pieceKey = piecesKeys.get(piece);
            System.out.printf("%s -> Composer: %s, Key: %s%n", piece, compositor, pieceKey);
        }

        /*piecesCompositors.entrySet()
                .forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n",
                        entry.getKey(), entry.getValue(), piecesKeys.get(entry.getKey())));*/

    }
}
