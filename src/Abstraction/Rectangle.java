package Abstraction;

public class Rectangle  extends Figure {

    public Rectangle (int a, int b){
        super(a, b);
    }

    @Override
    public int getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public int getArea() {
        return a * b;
    }

    @Override
    public String figureInfo() {
        return "Это геометрическая фигура - прямоугольник!";
    }
}
