package package1;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main (String arg[]){

        // 1. Get the number of hours worked
        System.out.println("Kindly input the number of hours you worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        // 2. Get the hourly pay rate
        System.out.println("Please input the hourly rate");
        double rate = scanner.nextDouble();
        scanner.close();

        // 3. Calculate total pay
        double totalPay = hours * rate;

        // 4. Display Result
        System.out.println("Your Total pay is $" + totalPay);
    }
}
