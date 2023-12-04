package OOP2.Intro;

public class Ex1 {
    private int feet;
    private int inches;

    public Ex1(int inches) {
        // TODO: Convert the total inches into feet and inches. One foot is 12 inches.
        // Store the feet and inches in their respective instance variables.
        this.inches = inches;
        if(inches < 0) {
            this.feet = -1;
            this.inches = -1;
        } else {
            this.feet = inches / 12;
            this.inches = inches % 12;
        }



    }

    public int getFeet() {
        // TODO: Return the value of feet.
        return feet;
    }

    public int getInches() {
        // TODO: Return the value of inches.
        return inches;
    }
}
