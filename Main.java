import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter SUV name: ");
        String suvName = scanner.nextLine();

        System.out.print("Enter number of wheels: ");
        int suvWheels = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter SUV type: ");
        String suvType = scanner.nextLine();
        SUV suv = new SUV(suvName, suvWheels, suvType);
        System.out.print("Enter acceleration speed: ");
        double accelerationSpeed = scanner.nextDouble();
        suv.accelerate(accelerationSpeed);
        scanner.close();
    }
}
