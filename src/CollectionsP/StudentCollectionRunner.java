package CollectionsP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollectionRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1, "Alex"),
                new Student(100, "Adam"),
                new Student(2, "Eve"));

        List<Student> studentsAl = new ArrayList<>(students);

        Collections.sort(studentsAl);
        System.out.println(students);

    }


}
