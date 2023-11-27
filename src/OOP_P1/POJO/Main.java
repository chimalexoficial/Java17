package OOP_P1.POJO;

public class Main {
    public static void main(String[] args) {
    for(int i = 0; i <= 5; i++) {
        LPAStudent s = new LPAStudent("592300" + i,
                switch(i) {
                    case 1 -> "Mary";
                    case 2 -> "Carol";
                    case 3 -> "Tim";
                    case 4 -> "Harry";
                    default -> "Anonymous";
                },
                "05/11/1985",
                "Java Masterclass");
        System.out.println(s);
    }

    Student pojoStudent = new Student("5923006", "Ann",
            "05/11/1985", "Java masterclass");
    LPAStudent recordStudent = new LPAStudent("9923007", "Bill",
            "05/11/1985", "Java Masterclass");

    System.out.println(pojoStudent);
    System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " +
            pojoStudent.getClassList());

        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());
    }
}
