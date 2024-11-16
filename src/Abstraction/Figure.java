package Abstraction;

public abstract class Figure {
    int a;
    int b;

    public Figure(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public abstract int getPerimeter();

    public abstract int getArea();

    public String figureInfo() {
        return "Это геометрическая фигура";
    }
}
