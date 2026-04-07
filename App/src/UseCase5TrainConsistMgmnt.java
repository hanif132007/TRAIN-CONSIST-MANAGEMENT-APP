import java.util.LinkedHashMap;
import java.util.Map;

public class UseCase5TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println(" UC5 - Manage Train Schedule (Map) ");
        System.out.println("=========================================\n");

        // 1. Initialize a LinkedHashMap to store the schedule
        // LinkedHashMap is used to preserve the chronological order of the schedule
        Map<String, String> trainSchedule = new LinkedHashMap<>();

        // 2. Add schedule entries (Time -> Station)
        trainSchedule.put("08:00 AM", "New York Central");
        trainSchedule.put("10:30 AM", "Philadelphia Station");
        trainSchedule.put("01:15 PM", "Washington DC Terminal");
        trainSchedule.put("04:00 PM", "Richmond Hub");

        // 3. Display the full schedule
        System.out.println("Current Train Schedule:");
        for (Map.Entry<String, String> entry : trainSchedule.entrySet()) {
            System.out.println("Time: " + entry.getKey() + " | Station: " + entry.getValue());
        }

        // 4. Update a station (Update operation)
        trainSchedule.put("10:30 AM", "North Philly Station");
        System.out.println("\nUpdated Schedule (10:30 AM arrival changed):");
        System.out.println("10:30 AM -> " + trainSchedule.get("10:30 AM"));

        // 5. Remove a stop (Delete operation)
        trainSchedule.remove("04:00 PM");
        System.out.println("\nFinal Schedule after removing Richmond stop:");
        System.out.println(trainSchedule);

        System.out.println("\nUC5 operations completed successfully...");
    }
}
