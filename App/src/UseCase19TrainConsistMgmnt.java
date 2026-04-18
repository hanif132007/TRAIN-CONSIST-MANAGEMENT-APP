import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class UseCase19TrainConsistMgmnt {

    static class PassengerBogie {
        String type;
        int capacity;

        PassengerBogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return type + " (" + capacity + " seats)";
        }
    }

    public static void main(String[] args) {
        System.out.println("=========================================================");
        System.out.println(" UC19 - Find Specific Bogie using findFirst() ");
        System.out.println("=========================================================\n");

        List<PassengerBogie> bogies = new ArrayList<>();
        bogies.add(new PassengerBogie("Sleeper", 72));
        bogies.add(new PassengerBogie("AC Chair", 56));
        bogies.add(new PassengerBogie("General", 70));

        String searchTarget = "AC Chair";

        Optional<PassengerBogie> result = bogies.stream()
                .filter(b -> b.type.equalsIgnoreCase(searchTarget))
                .findFirst();


        if (result.isPresent()) {
            System.out.println("Bogie Found: " + result.get());
        } else {
            System.out.println("Search Result: No bogie found with type '" + searchTarget + "'");
        }

        System.out.println("\nUC19 search operation completed...");
    }
}