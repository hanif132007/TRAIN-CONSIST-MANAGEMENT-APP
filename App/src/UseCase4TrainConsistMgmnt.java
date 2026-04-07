import java.util.LinkedList;

public class UseCase4TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("=========================================\n");

        // 1. Initialize LinkedList (ideal for frequent inserts/removals)
        LinkedList<String> trainConsist = new LinkedList<>();

        // 2. Add bogies in sequence
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Original Consist: " + trainConsist);

        // 3. Insert Pantry Car at position 2 (0-based index)
        trainConsist.add(2, "Pantry Car");
        System.out.println("After Adding Pantry Car at pos 2: " + trainConsist);

        // 4. Remove the first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("After Removing First and Last bogies: " + trainConsist);

        // 5. Final Display
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 operations completed successfully...");
    }
}
