import java.util.LinkedHashMap;
import java.util.Map;

public class UseCase6TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println(" UC6 - Train Departure Board (Iteration) ");
        System.out.println("=========================================\n");

        // 1. Initialize the schedule
        Map<String, String> departureBoard = new LinkedHashMap<>();
        departureBoard.put("09:00 AM", "Boston Express");
        departureBoard.put("11:15 AM", "New York Limited");
        departureBoard.put("01:45 PM", "Washington DC Metro");
        departureBoard.put("04:30 PM", "Florida Coastal");

        // 2. Iterate using Lambda Expression (The modern approach)
        System.out.println("--- OFFICIAL DEPARTURE BOARD ---");
        departureBoard.forEach((time, train) -> {
            System.out.println("DEPARTING AT: " + time + " | TRAIN: " + train);
        });

        // 3. Status update
        System.out.println("\nAll departure entries processed.");
        System.out.println("UC6 operations completed successfully...");
    }
}
