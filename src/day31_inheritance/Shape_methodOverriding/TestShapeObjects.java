package day31_inheritance.Shape_methodOverriding;

public class TestShapeObjects {
    public static void main(String[] args) {

        Square square = new Square("Square", 5);
        System.out.println(square);
        square.draw();

        System.out.println("--------------------------------------------");
        Circle circle = new Circle("Circle", 3.5);
        System.out.println(circle);
        circle.draw();

        System.out.println("-----------------------------------------------------");
        Rectangle rectangle = new Rectangle("Rectangle", 4,8);
        System.out.println(rectangle);
        rectangle.draw();
    }
}





