package package2;

import java.util.Scanner;

public class Cashier {
    public static void main (String[] arg){

        // Get number of items to scan
        System.out.println("Please input the number of items you would like to check out");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        // iterate through the items and add them
        int total = 0;
        for (int i = 0; i < quantity; i++){
            System.out.println("input price for the item");
            int price = scanner.nextInt();
            total += price;
        }
        scanner.close();
        System.out.println("Your total price is $" + total);
    }
}
