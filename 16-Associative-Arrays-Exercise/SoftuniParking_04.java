package Maps_Exercise;

import java.util.*;

public class SoftuniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> parkingData = new LinkedHashMap<>();

        int countCommands = Integer.parseInt(scanner.nextLine());

        for (int count = 1; count <= countCommands; count++) {
            String command = scanner.nextLine();
            //1. command = "register {username} {licensePlateNumber}"
            //2. command = "unregister {username}"
            String [] commandParts = command.split(" ");
            //commandParts = ["register", "{username}", "{licensePlateNumber}"]
            //commandParts = ["unregister", "{username}"]
            String commandName = commandParts[0]; //"register" или "unregister"
            String username = commandParts[1]; //име на собственик

            if (commandName.equals("register")) {
                String carNumber = commandParts[2]; //номер на колата
                //1. имаме такъв собственик в паркинга
                if (parkingData.containsKey(username)) {
                    System.out.println("ERROR: already registered with plate number " + parkingData.get(username));
                }
                //2. нямаме такъв собственик в паркинга
                else {
                    parkingData.put(username, carNumber);
                    System.out.printf("%s registered %s successfully%n", username, carNumber);
                }
            } else if (commandName.equals("unregister")) {
                //1. нямали сме такъв собственик
                if (!parkingData.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                }
                //2. имали сме такъв собственик
                else {
                    parkingData.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }

            }

        }

        //parkingData: собственик => номер на колата
        //entry -> съхраняваме всеки един запис
        //entry.getKey() -> собственика
        //entry.getValue() -> номер на автомобила
        parkingData.entrySet().forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));
    }
}
