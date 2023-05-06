package day31_inheritance.Shape_methodOverriding;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(String name, double width, double length) {
        super(name);
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return (2*length)+(2*width);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("\t* * * * * * * *");
        for(int i = 0; i<3; i++){
            System.out.println("\t*             *");
        }
        System.out.println("\t* * * * * * * *");
    }
}
