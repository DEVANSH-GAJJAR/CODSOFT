import java.util.Scanner;

public class ATM {
    private static double balance = 1000.00; // Initial balance

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n WELCOME TO ATM :");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.println("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // CHECKING THE BALANCE
                    System.out.println("Current Balance: rupees  " + balance);
                    break;

                case 2: // DEPOSITION OF MONEY
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposit successful! New balance:  rupees   " + balance);
                    } else {
                        System.out.println("Invalid amount. Try again.");
                    }
                    break;

                case 3: // WITHDRAWEL OF MONEY
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful! New balance: rupees " + balance);
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds. Try again.");
                    } else {
                        System.out.println("Invalid amount. Try again.");
                    }
                    break;

                case 4: // EXIT
                    System.out.println("Thank you for using the ATM. Have a nice day!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
