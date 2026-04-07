import java.util.ArrayList;
import java.util.List;

public class UseCase1TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("=======================================================");
        System.out.println(" === Train Consist Management App ===");
        System.out.println("=======================================================\n");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully...");
        System.out.println("Current Bogie Count: " + trainConsist.size());
        System.out.println("Status: The train is currently empty.");
    }
}
