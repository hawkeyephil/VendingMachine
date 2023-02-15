import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        //Commit 1: Welcome message
        int balance = 0;
        System.out.println("Welcome");
        System.out.println("------------------");
        System.out.println("Vending machine balance: " + balance);
        System.out.println("------------------");
        
        //Commit 2: Listing out all of the Options/Taking in money 
        System.out.println("Options Available:");
        System.out.println("Nerd Clusters: $3.00");
        System.out.println("Twix: $2.00");
        System.out.println("Kit Kat: $2.00");
        System.out.println("M&Ms: $1.50");
        System.out.println("Hershey Bar: $1.00"); 

        System.out.println("Enter whole bills");
        Scanner scannerObject = new Scanner(System.in);
        int moneyEntered = 0;
        moneyEntered = scannerObject.nextInt();
        //Commit 3: Choose an option/and confirm purchase 

        //Commit 4: Process it 

    }
}
