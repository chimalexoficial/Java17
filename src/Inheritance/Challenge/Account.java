package Inheritance.Challenge;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    //constructor this() called inside constructor
    public Account() {
        this("56789", 2.50, "default name", "default email", "default pone");
        System.out.println("Empty constructor called");
    }

    //creating first constructor
    public Account(String number, double balance, String customerName, String email, String phone) {
        System.out.println("Account constructor with params called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;
    }

    //creating second constructor
    public Account(String customerName, String customerEmail, String customerPhone) {
        this("9999", 100.55, customerName, customerEmail, customerPhone);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhone = customerPhone;
    }

    public void withdraw(double withdrawalAmount) {
        if(balance - withdrawalAmount < 0) {
            System.out.println("Not allowed!");
        } else {
            System.out.println(balance -= withdrawalAmount);
        }
    }

    public void depositFunds(double depositAmount) {
        System.out.println(balance += depositAmount);
    }
    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
