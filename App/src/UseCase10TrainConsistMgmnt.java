import java.util.ArrayList;
import java.util.List;

/**
 * ========================================================
 * MAIN CLASS - UseCase10TrainConsistMgmnt
 * ========================================================
 * Use Case 10: Count Total Seats in Train
 */
public class UseCase10TrainConsistMgmnt {

    // Reusing Bogie model
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("UC10 - Count Total Seats in Train");
        System.out.println("==========================================");

        // 1. Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // 2. Display bogies
        System.out.println("\nBogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // 3. AGGREGATE USING REDUCE
        // map() extracts capacity field from Bogie object
        // reduce(0, Integer::sum) calculates the total
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // 4. Display total seat count
        System.out.println("\nTotal Seating Capacity of Train: " + totalCapacity);
        System.out.println("\nUC10 aggregation completed...");
    }
}