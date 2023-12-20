package Arrays18;

import java.math.BigDecimal;

public class Student {
    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getNumberOfMarks() {
        return marks.length;
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for(int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        return sum;
    }

    public int getMaximumMark() {
        int maximum = 0;
        for(int i = 0; i < marks.length; i++) {
            if(marks[i] > maximum) {
                maximum = marks[i];
            }
        }
        return maximum;
    }

    public int getMinimumMark() {
        int minimum = 1000;
        for(int i = 0; i < marks.length; i++) {
            if(marks[i] < minimum) {
                minimum = marks[i];
            }
        }
        return minimum;
    }

    public BigDecimal getAverageMasks() {
        BigDecimal sum = BigDecimal.valueOf((Integer) getTotalSumOfMarks() / marks.length);
        return sum;
    }
}
