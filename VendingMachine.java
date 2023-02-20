import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        String candy;
        double price;
        int balance = 0;

        welcomeMessage();

        System.out.println("\nEnter Number of $1 Bills Inserted");
        Scanner scannerObject = new Scanner(System.in);
        int moneyEntered = 0;

        //Commit 3: Choose an option/and confirm purchase 
        try {
            moneyEntered = scannerObject.nextInt();
            balance = moneyEntered;
            System.out.println("\n--------------------------");
            System.out.println("Vending machine balance: $" + balance);
            System.out.println("--------------------------\n");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid Input. Please enter whole bills.");
            System.exit(0);
        }
        //Determine which treat they want
        try {
            System.out.println("Please Select a Treat:");
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
                price = 2.00;
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
            //If cost is more than entered amount display an error
            if (price > balance ) {
                System.out.println("\nInsufficient Funds, Returning $" + balance);
                balance = 0;
                System.out.println("--------------------------");
                System.out.println("Vending machine balance: $" + balance);
                System.out.println("--------------------------\n");
                System.exit(0);
            }

            //Commit 4: Process it 
            System.out.println("Would you like to continue?\n1. Yes\n2. No");
            int proceed = scannerObject.nextInt();
            //Confirm purchase
            if (proceed == 1) {
                System.out.println("\nConfirming purchase...");
                System.out.println("Please Grab your " + candy); 
                int change = balance - (int)price;
                if(change > 0) {
                    System.out.println("\nRemeber to Grab Your Change: $" + change); 
                } 
                System.out.println("Enjoy and Have a Great Day!\n");
            } 
            //Cancel purchase
            if (proceed == 2) {
                System.out.println("\nCancelling Purchase... Returning $" + balance);
                balance = 0;
                System.out.println("--------------------------");
                System.out.println("Vending machine balance: $" + balance);
                System.out.println("--------------------------");
                System.out.println("\nRefund Issued, Have a Great Day!\n");
                System.exit(0);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter 1 or 2.");
            System.exit(0);
        }
       
    }

    //Commit 1: Welcome message
    public static void welcomeMessage() {
        System.out.println("Welcome!");
        System.out.println("Our Snacks and Prices are Listed Below");
        System.out.println("We Only Accept $1 Bills");
        System.out.println("--------------------------------------");
        printOptions();
    }

    //Commit 2: Listing out all of the Options/Taking in money
    public static void printOptions() { 
        System.out.println("Options Available:");
        System.out.println("1. Nerd Clusters: $3.00");
        System.out.println("2. Twix: $2.00");
        System.out.println("3. Kit Kat: $2.00");
        System.out.println("4. M&Ms: $2.00");
        System.out.println("5. Hershey Bar: $1.00"); 
    }
}
