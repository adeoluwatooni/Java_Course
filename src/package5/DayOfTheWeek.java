package package5;

import java.util.Scanner;

public class DayOfTheWeek {
    private static Scanner scanner = new Scanner(System.in);
    static String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static void main (String arg[]){
        System.out.println("Kindly input a whole number between 1 and 7");
        getDay();
        scanner.close();
    };

    public static void getDay (){
        int dayNumber = scanner.nextInt();

        switch(dayNumber){
            case 1:
                System.out.println(weekDays[0]);
                break;
            case 2:
                System.out.println(weekDays[1]);
                break;
            case 3:
                System.out.println(weekDays[2]);
                break;
            case 4:
                System.out.println(weekDays[3]);
                break;
            case 5:
                System.out.println(weekDays[4]);
                break;
            case 6:
                System.out.println(weekDays[5]);
                break;
            case 7:
                System.out.println(weekDays[6]);
                break;
            default:
                System.out.println("Inputted number is not within the range of 1 and 7");
        }
    }
};




