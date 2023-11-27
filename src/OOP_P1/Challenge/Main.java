package OOP_P1.Challenge;

public class Main {
    public static void main(String[] args) {
//    Account bobsAccount = new Account("12345", 500, "Bob Brown", "myemail@bob.com", "323-899-3249");
//    System.out.println(bobsAccount.getNumber());
//    System.out.println(bobsAccount.getBalance());

        Account bobsAccount = new Account();

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdraw(100.00);
        bobsAccount.depositFunds(250);
        bobsAccount.withdraw(50);
        bobsAccount.withdraw(200);
        bobsAccount.depositFunds(100);
        bobsAccount.withdraw(45.55);
        bobsAccount.withdraw(54.46);
        bobsAccount.withdraw(54.45);

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println("AccountNo " + timsAccount.getNumber() + "; name " + timsAccount.getCustomerName());
    }
}
