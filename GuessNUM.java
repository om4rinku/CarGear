import java.util.Scanner;
public class GuessNUM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 100);
        int yourNum;
        do {
            System.out.print("Enter your number to guess it: ");
             yourNum = scanner.nextInt();
            if (yourNum == randomNum) {
                System.out.print("You WIN");
                break;

            } else if (yourNum>randomNum) {
                System.out.println("Your Num is bigger");

            } else  {
                System.out.println("Your Num is Smaller");

            }
        }while(yourNum>=0);

        System.out.print(" My  random Number was: ");
        System.out.println(randomNum);

    }
}
