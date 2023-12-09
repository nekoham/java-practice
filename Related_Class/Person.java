package Related_Class;

public class Person {
    //Data fields
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;

    //Constructor
    public Person() {
    }
    public Person(String name) {
        this.name = name;
    }

    //Methods
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return "Person{name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", email=" + email + "}";
    }
}
