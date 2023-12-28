package ObjectOriented20;

public class Customer2Runner {
    public static void main(String[] args) {
        Address homeAddress = new Address("111 Home St.", "Pasadena Home", "90872H");
        Customer2 customer = new Customer2("John", homeAddress);
        Address workAddress = new Address("111 Work St.", "Pasadena Work", "90872W");
        customer.setWorkAddress(workAddress);
        System.out.println(customer);
    }
}
