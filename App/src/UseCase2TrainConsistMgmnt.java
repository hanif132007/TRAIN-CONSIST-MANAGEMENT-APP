import java.util.ArrayList;
import java.util.List;

public class UseCase2TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("=========================================\n");

        // 1. Create an ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // 2. CREATE: Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n");

        // 3. DELETE: Remove one bogie
        passengerBogies.remove("AC Chair");

        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n");

        // 4. READ/SEARCH: Use contains() to check if Sleeper exists
        System.out.println("Checking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + passengerBogies.contains("Sleeper") + "\n");

        // 5. Final Display
        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies + "\n");

        System.out.println("UC2 operations completed successfully...");
    }
}
