package ObjectOriented20;

public class Customer2 {
    private String name;

    // Object Composition
    private Address homeAddress;
    private Address workAddress;

    //creating
    public Customer2(String name, Address homeAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
    }

    //operations
    public Address getHomeAddress() {
        return homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setHomeAddress() {
        this.homeAddress = homeAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public String toString() {
        return String.format("name: %s - home address: %s - work address: %s", name, homeAddress, workAddress);
    }
}
