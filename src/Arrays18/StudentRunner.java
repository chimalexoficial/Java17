package Arrays18;

import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {
        int[] marks = {99,98,100};
        StudentRefactor student = new StudentRefactor("Ranga", marks);
        int number = student.getNumberOfMarks(); //3
        int sum = student.getTotalSumOfMarks();
        int maximumMark = student.getMaximumMark();
        int minimumMark = student.getMinimumMark();
        BigDecimal average = student.getAverageMasks();
        System.out.println("average is " + average);
        System.out.println(student);

        student.addNewMark(35);
        student.removeMarkAtIndex(1);

    }
}
