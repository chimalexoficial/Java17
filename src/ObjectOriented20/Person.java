package ObjectOriented20;

public class Person {
    private String name, email, phoneNumber;

    //getters setters
    public Person(String name) {
        this.name = name;
        System.out.println("Person constructor");
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return name + " # " + email + " # " + phoneNumber;
    }
}
