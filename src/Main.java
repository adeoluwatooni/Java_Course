import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            // 1. Get the season of the year
            System.out.println("input the season");
            Scanner scanner = new Scanner(System.in);
            String season = scanner.next();

            // 2. Get a number of cups
            System.out.println("Input whole number");
            int cups = scanner.nextInt();

            // 3. Get the Adjective
            System.out.println("Describe the adjective");
            String seasonDescription = scanner.next();

            if ( "rainy".equals(seasonDescription)){
                // Display Result
                System.out.println("On a " + seasonDescription +" " + season + " day, I drink a minimum of " + cups + " cups of coffee");
            } else System.out.println("Its the wrong season yo !");



        }
    }