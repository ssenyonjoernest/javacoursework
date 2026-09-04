import java.util.Scanner;

public class Bodabodafare {

    // Constants
    static final double BASE_FARE = 2000.0;
    static final double RATE_PER_KM = 500.0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user for distance
        System.out.print("Enter distance travelled in km: ");
        double distance = input.nextDouble();

        // Calculate total fare
        double totalFare = BASE_FARE + (RATE_PER_KM * distance);

        // Display the fare
        System.out.println("Your fare for " + distance + " km is UGX " + totalFare + ".");

        input.close();
    }
}