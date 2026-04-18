import java.util.HashMap;
import java.util.Map;


public class UseCase20TrainConsistMgmnt {

    public static void main(String[] args) {
        System.out.println("=========================================================");
        System.out.println(" UC20 - Mapping Bogies to Capacities (HashMap) ");
        System.out.println("=========================================================\n");


        Map<String, Integer> bogieMap = new HashMap<>();

        bogieMap.put("Sleeper", 72);
        bogieMap.put("AC Chair", 56);
        bogieMap.put("General", 70);
        bogieMap.put("Luxury", 24);

        System.out.println("Registered Bogie Capacities:");
        bogieMap.forEach((type, cap) -> System.out.println("-> " + type + ": " + cap + " seats"));

        String searchKey = "Sleeper";
        if (bogieMap.containsKey(searchKey)) {
            int capacity = bogieMap.get(searchKey);
            System.out.println("\nQuick Lookup: The capacity of '" + searchKey + "' is " + capacity);
        }

        System.out.println("\nUC20 map operations completed...");
    }
}