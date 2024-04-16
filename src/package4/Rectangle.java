package package4;

public class Rectangle {

    private double length;
    private double width;

    // Constructor 1
    public Rectangle (){
        length = 2;
        width = 4;
    }

    // Constructor 2
    public Rectangle (double length, double width){
        this.setLength(length);
        this.setWidth(width);
    }

    public double calculatePerimeter(){
        return 2*(length + width);
    }

    public double calculateArea(){
        return length * width;
    }

    // Getters and Setters

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth( double width ){
        this.width = width;
    }
}
