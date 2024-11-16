package Module1;

public class Calculator {
    double a;
    double b;
    Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }
    double sum(double a, double b) {
        return a + b;
    }
    double subtract(double a, double b) {
        return a - b;
    }
    void multiplication() {
        System.out.println("Умножение ровно " + a * b);
    }
    void division() {
        System.out.println("Деление ровно " + a / b);
    }


}
