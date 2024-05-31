public class Person {

    private final String lastName;
    private final String firstName;
    private final Address home;
 
//Constructor
public Person(String lastName, String firstName, Address home) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.home = home;
    }
 
    //Method to get the name
    @Override
    public String toString() {
        return (this.firstName + " " + this.lastName + ", " + this.home);
    }
}