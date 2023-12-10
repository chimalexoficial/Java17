package PrimitiveDataTypes11;

public class BiNumber1 {
    private int a, b;

    //constructor
    public BiNumber1(int a, int b) {
        this.a = a;
        this.b = b;
    }
    //getters

    public int getNumber1() {
        return a;
    }

    public int getNumber2() {
        return b;
    }

    public int add() {
        return a + b;
    }

    public int multiply() {
        return a * b;
    }

    public void doubleValue() {
        this.a = a * 2;
        this.b = b * 2;
    }
}


