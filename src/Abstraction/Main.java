package Abstraction;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle( 4,9);
        int rectanglePerimeter = rectangle.getPerimeter();
        int rectangleArea = rectangle.getArea();
        System.out.println(rectangle.figureInfo());
        System.out.println("Периметр прямоугольника: " + rectanglePerimeter);
        System.out.println("Площадь прямоугольника: " + rectangleArea);
        System.out.println("--------------------------------");
        Triangle triangle = new Triangle(8,9,4);
        int trianglePerimeter = triangle.getPerimeter();
        int triangleArea = triangle.getArea();
        System.out.println(triangle.figureInfo());
        System.out.println("Периметр треугольника: " + trianglePerimeter);
        System.out.println("Площадь треугольника: " + triangleArea);



    }

}
