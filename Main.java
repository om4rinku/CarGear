import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for SUV details
        System.out.print("Enter SUV name: ");
        String suvName = scanner.nextLine();

        System.out.print("Enter number of wheels: ");
        int suvWheels = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter SUV type: ");
        String suvType = scanner.nextLine();

        // Create SUV object
        SUV suv = new SUV(suvName, suvWheels, suvType);

        // Get user input for acceleration
        System.out.print("Enter acceleration speed: ");
        double accelerationSpeed = scanner.nextDouble();

        // Perform acceleration
        suv.accelerate(accelerationSpeed);

        // Close the scanner
        scanner.close();
    }
}
/*In summary, the main method in the Main class orchestrates the creation of an SUV object and its subsequent acceleration.
The accelerate method in the SUV class handles the logic of updating the speed, determining the gear, and calling the changeGear method.
The changeGear method in the Car class updates the current gear and prints information about the SUV's current state.
 The Vehicle class provides methods for accessing and modifying the current speed and direction.*/