import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ========================================================
 * MAIN CLASS - UseCase11TrainConsistMgmnt
 * ========================================================
 * Use Case 11: Validate Train ID and Cargo Code
 * Description: Validates input formats using Regular Expressions.
 */
public class UseCase11TrainConsistMgmnt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("UC11 - Validate Train ID and Cargo Code");
        System.out.println("==========================================");

        // 1. Accept Train ID Input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        // 2. Accept Cargo Code Input
        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // 3. Define Regex Rules
        // TRN- followed by exactly 4 digits
        String trainIdRegex = "TRN-\\d{4}";
        // PET- followed by exactly 2 uppercase letters
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // 4. Apply Regex Validation
        boolean isTrainValid = Pattern.matches(trainIdRegex, trainId);
        boolean isCargoValid = Pattern.matches(cargoCodeRegex, cargoCode);

        // 5. Display Validation Results
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + isTrainValid);
        System.out.println("Cargo Code Valid: " + isCargoValid);

        System.out.println("\nUC11 validation completed...");

        scanner.close();
    }
}