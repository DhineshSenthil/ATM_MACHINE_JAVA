import java.util.Scanner;

public class ATM_Project {
    public static void main(String[] args) {
        int pin = 1224;
        int balance = 10000;
        int Addamount = 0;
        int Takeamount = 0;
        String name;

        Scanner scanner = new Scanner(System.in);  // "in" for print in console

        // Take an input from the user
        System.out.println("Enter your pin number:");
        int password = scanner.nextInt();

        if (password == pin) {
            System.out.println("PIN CORRECT");
            System.out.println("Enter your name");
            name = scanner.next();
            System.out.println("Welcome " + name);

            while (true) {
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to add amount");
                System.out.println("Press 3 to take amount");
                System.out.println("Press 4 for receipt");
                System.out.println("Press 5 to EXIT");
                int opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("Your current balance: " + balance);
                        break;
                    case 2:
                        System.out.println("Enter amount to add:");
                        Addamount = scanner.nextInt(); // Store input
                        System.out.println("Successfully credited....");
                        balance += Addamount;
                        break;
                    case 3:
                        System.out.println("Enter amount to take:");
                        Takeamount = scanner.nextInt();
                        if (Takeamount > balance) {
                            System.out.println("Insufficient balance");
                        } else {
                            System.out.println("Amount debited successfully: " + Takeamount);
                            balance -= Takeamount;
                        }
                        break;
                    case 4:
                        System.out.println("Welcome to ATM ");
                        System.out.println("Available balance: " + balance);
                        System.out.println("Amount deposited: " + Addamount);
                        System.out.println("Amount taken: " + Takeamount);
                        System.out.println("Thanks for coming");
                        break;
                    case 5:
                        System.out.println("Thank you....");
                        scanner.close();
                        return; // Exit the main method and terminate the program
                    default:
                        System.out.println("Invalid option. Please choose a number between 1 and 5.");
                        break;
                }
            }
        } else {
            System.out.println("Wrong PIN");
        }
    }
}
