package ObjectOriented20;

public class StudentRunner {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("Alex");
//        student.setEmail("mail@mail.com");
//
//        Person person = new Person();
//        String value = person.toString();
//        System.out.println(value);
//        System.out.println(person);

        Employee employee = new Employee("Alex", "Programmer Analyst");
        employee.setName("Alex");
        employee.setEmail("mail@mail.com");
        employee.setPhoneNumber("323988763823");
        employee.setEmployeeGrade('A');
        employee.setTitle("Programmer Analyst");

        System.out.println(employee);
    }
}
