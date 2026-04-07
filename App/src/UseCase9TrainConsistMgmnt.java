import java.util.*;
import java.util.stream.Collectors;

/**
 * ======================================================
 * MAIN CLASS - UseCase9TrainConsistMgmnt
 * ======================================================
 * * Use Case 9: Group Bogies by Type
 * * Description:
 * This class groups similar bogies together using
 * Java Stream Collectors.groupingBy().
 */
public class UseCase9TrainConsistMgmnt {

    // Reusing Bogie model from UC7 / UC8
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return "  Capacity -> " + capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("======================================================");
        System.out.println(" UC9 - Group Bogies by Type ");
        System.out.println("======================================================\n");

        // 1. Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 60));

        // 2. Display input bogies
        System.out.println("All Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // 3. GROUP USING COLLECTORS.GROUPINGBY
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // 4. Display grouped structure
        System.out.println("\nGrouped Bogies:");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nBogie Type: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println(b);
            }
        }

        System.out.println("\nUC9 grouping completed...");
    }
}