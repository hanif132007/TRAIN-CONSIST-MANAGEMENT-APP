import java.util.ArrayList;
import java.util.List;


public class UseCase12TrainConsistMgmnt {

    // Goods Bogie model
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public String getType() { return type; }
        public String getCargo() { return cargo; }
    }

    public static void main(String[] args) {
        System.out.println("=========================================================");
        System.out.println(" UC12 - Safety Compliance Check for Goods Bogies ");
        System.out.println("=========================================================\n");

        // 1. User prepares a list of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open-Top", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Chemicals"));
        // Uncomment the line below to test a safety violation (Coal in Cylindrical)
        // goodsBogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // 2-4. Convert to stream and use allMatch() with conditional logic
        boolean isTrainSafe = goodsBogies.stream().allMatch(bogie -> {
            if (bogie.getType().equalsIgnoreCase("Cylindrical")) {
                // Safety Rule: Cylindrical bogies must NOT carry solid cargo like Coal
                return !bogie.getCargo().equalsIgnoreCase("Coal");
            }
            // Add other domain rules here as needed
            return true;
        });

        // 5-6. Display the safety status result
        if (isTrainSafe) {
            System.out.println(">>> STATUS: [SAFE]");
            System.out.println("All bogies comply with domain safety rules. Train formation is valid.");
        } else {
            System.out.println(">>> STATUS: [CRITICAL SAFETY VIOLATION]");
            System.out.println("Invalid cargo assignment detected! Train formation aborted.");
        }
    }
}