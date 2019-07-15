
public class Calculator {
    private int a, b;

    public Calculator() {
        this.a = 0;
        this.b = 0;
    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public int sub() {
        return a - b;
    }

    public int div() {
        return a / b;
    }

    public int mult() {
        return a * b;
    }
}