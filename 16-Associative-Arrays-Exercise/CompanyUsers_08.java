package Maps_Exercise;

import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> companyEmployees = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            //input = "{companyName} -> {employeeId}"
            //.split(" -> ")
            //["{companyName}", "{employeeId}"]
            String companyName = input.split(" -> ")[0]; //име на компания
            String employeeId = input.split(" -> ")[1]; //служител

            //1. имаме вече такава компания
            if (companyEmployees.containsKey(companyName)) {
                //!!!! добавяме служителя ако го няма в списъка със служители на компанията
                List<String> currentEmployees = companyEmployees.get(companyName);
                if (!currentEmployees.contains(employeeId)) {
                    currentEmployees.add(employeeId);
                }
            }
            //2. нямаме такава компания
            else {
                companyEmployees.put(companyName, new ArrayList<>());
                companyEmployees.get(companyName).add(employeeId);
            }


            input = scanner.nextLine();
        }

        //companyEmployees: компания -> списък със служители
        companyEmployees.entrySet().forEach(entry -> {
            //entry
            //entry.getKey() -> име на компанията
            //entry.getValue() -> списък със служители
            String companyName = entry.getKey();
            List<String> employeesList = entry.getValue();

            System.out.println(companyName);
            for (String employee : employeesList) {
                System.out.println("-- " + employee);
            }
        });
    }
}
