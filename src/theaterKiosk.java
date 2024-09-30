import java.util.Scanner;
public class theaterKiosk {
    public static void main(String[] args) {
        int age;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your age please: ");
        if (in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine();  // Consume the newline character

            if (age >= 21) {
                System.out.println("You get a wristband!");
            } else {
                System.out.println("No wristband");
            }
        } else {
            System.out.println("Invalid input, please enter a valid age.");
        }
    }
}


