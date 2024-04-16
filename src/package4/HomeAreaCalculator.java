package package4;

public class HomeAreaCalculator {
    public static void main (String[] args){

        // First Home

//        Rectangle area1 = new Rectangle();
//        double area = area1.calculateArea();
//        System.out.println(area);

        Rectangle home1 = new Rectangle();
        Rectangle home2 = new Rectangle(24,15);

        double home1Area = home1.calculateArea();
        System.out.println(home1Area);

        double home2Area = home2.calculateArea();
        System.out.println(home2Area);

    }
}
