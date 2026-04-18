import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class UseCase18TrainConsistMgmnt {

    static class PassengerBogie {
        String type;
        int capacity;

        PassengerBogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return type + " (" + capacity + ")";
        }
    }

    public static void main(String[] args) {
        System.out.println("=========================================================");
        System.out.println(" UC18 - Filtering with Predicate Interface ");
        System.out.println("=========================================================\n");

        List<PassengerBogie> bogies = new ArrayList<>();
        bogies.add(new PassengerBogie("Sleeper", 72));
        bogies.add(new PassengerBogie("AC Chair", 56));
        bogies.add(new PassengerBogie("General", 70));
        bogies.add(new PassengerBogie("Luxury", 24));


        Predicate<PassengerBogie> isHighCapacity = b -> b.capacity >= 60;

        System.out.println("High Capacity Bogies (>= 60):");

        for (PassengerBogie bogie : bogies) {
            if (isHighCapacity.test(bogie)) {
                System.out.println("-> " + bogie);
            }
        }

        System.out.println("\nUC18 predicate filtering completed...");
    }
}