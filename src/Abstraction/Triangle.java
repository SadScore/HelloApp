package Abstraction;

public class Triangle extends Figure {
    int c;

    public Triangle(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public int getPerimeter() {
        return a + b + c;
    }

    @Override
    public int getArea() {
        double p = (double) getPerimeter() / 2;
        double area = Math.sqrt((p * (p - a) * (p - b) * (p - c)));
        return (int) area;
    }

    @Override
    public String figureInfo() {
        return "Эта геометрическая фигура - треугольник!";
    }
}
