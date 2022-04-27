package data;
public class Customer {

    private String ID;
    private String firstName;
    private String lastName;
    private String phone;
    
    //constructor
    public Customer(String ID, String firstName, String lastName, String phone) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }
    
    // empty constructor
    public Customer() {}
    
    // --------------- Create Setter & Getter for every variables ------------------

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    //print out
    @Override
    public String toString() {

        return (String.format("%s %s %s %s", ID, firstName, lastName, phone));
    }
}
