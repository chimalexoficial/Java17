package OOP2.Intro;

public class BookRunner {
    public static void main(String[] args) {
        Book artOfComputerProgramming = new Book(1000);
        Book effectiveJava = new Book(2000);
        Book cleanCode = new Book(3000);

//        artOfComputerProgramming.noOfCopies = 100;
//        effectiveJava.noOfCopies = 200;
//        cleanCode.noOfCopies = 300;

        artOfComputerProgramming.setNoOfCopies(100);
        effectiveJava.setNoOfCopies(200);
        cleanCode.setNoOfCopies(300);
    }
}
