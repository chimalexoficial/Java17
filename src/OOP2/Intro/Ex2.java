package OOP2.Intro;

public class Ex2 {

    private int side;

    public Ex2(int side) {
        // TODO: Initialize side with the passed value
        this.side = side;
    }

    public int calculateArea() {
        // TODO: Calculate and return the area of the square
        if(this.side <= 0) {
            return -1;
        }
            return this.side * this.side;
    }

    public int calculatePerimeter() {
        // TODO: Calculate and return the perimeter of the square
        if(this.side <= 0) {
            return -1;
        }
        return this.side * 4;
    }

}
