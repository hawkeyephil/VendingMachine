import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        String candy;
        double price;
        
        //Commit 1: Welcome message
        int balance = 0;
        System.out.println("Welcome");
        System.out.println("--------------------------");
        System.out.println("Vending machine balance: $" + balance);
        System.out.println("--------------------------");
        
        //Commit 2: Listing out all of the Options/Taking in money 
        System.out.println("Options Available:");
        System.out.println("1. Nerd Clusters: $3.00");
        System.out.println("2. Twix: $2.00");
        System.out.println("3. Kit Kat: $2.00");
        System.out.println("4. M&Ms: $1.50");
        System.out.println("5. Hershey Bar: $1.00"); 

        System.out.println("\nEnter whole bills:");
        Scanner scannerObject = new Scanner(System.in);
        int moneyEntered = 0;

        //Commit 3: Choose an option/and confirm purchase 
        try {
            moneyEntered = scannerObject.nextInt();
            balance = moneyEntered;
            System.out.println("\n--------------------------");
            System.out.println("Vending machine balance: $" + balance);
            System.out.println("--------------------------");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid Input. Please enter whole bills.");
            System.exit(0);
        }

        try {
            System.out.println("Enter your choice:");
            int choice = scannerObject.nextInt();
            if (choice == 1) {
                candy = "Nerd Clusters";
                price = 3.00;
                System.out.println("\nYou selected: " + candy + " for $" + price + "0");
            } else if (choice == 2) {
                candy = "Twix";
                price = 2.00;
                System.out.println("\nYou selected: " + candy + " for $" + price + "0");
            } else if (choice == 3) {
                candy = "KitKat";
                price = 2.00;
                System.out.println("\nYou selected: " + candy + " for $" + price + "0");
            } else if (choice == 4) {
                candy = "M&Ms";
                price = 1.50;
                System.out.println("\nYou selected: " + candy + " for $" + price + "0");
            } else if (choice == 5) {
                candy = "Hershey Bar";
                price = 1.00;
                System.out.println("\nYou selected: " + candy + " for $" + price + "0");
            } else {
                candy = null;
                price = 0;
                System.out.println("\nInvalid choice.");
                System.exit(0);
            }

            if (price > balance ) {
                System.out.println("\nInsufficient balance, returning money.");
                balance = 0;
                System.out.println("--------------------------");
                System.out.println("Vending machine balance: $" + balance);
                System.out.println("--------------------------");
                System.exit(0);
            }

            System.out.println("Would you like to continue?\n1. Yes\n2. No");
            int proceed = scannerObject.nextInt();
            if (proceed == 1) {
                System.out.println("\nConfirming purchase...");
            } if (proceed == 2) {
                System.out.println("\nCancelling purchase... returning money.");
                balance = 0;
                System.out.println("--------------------------");
                System.out.println("Vending machine balance: $" + balance);
                System.out.println("--------------------------");
                System.exit(0);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please only enter numbers.");
            System.exit(0);
        }


       
        //Commit 4: Process it 

    }
}
