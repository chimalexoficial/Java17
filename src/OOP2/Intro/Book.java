package OOP2.Intro;

public class Book {
    private int noOfCopies;

    public Book(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public void increaseNoOfCopies(int howMuch) {
        setNoOfCopies(this.noOfCopies + howMuch);
    }

    public void decreaseNoOfCopies(int howMuch) {
        setNoOfCopies(this.noOfCopies - howMuch);
    }


}
