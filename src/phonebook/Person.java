
package phonebook;

import javafx.beans.property.SimpleStringProperty;


public class Person {
    
    private final SimpleStringProperty lastName;
    private final SimpleStringProperty firstName;
    private final SimpleStringProperty email;
    
    
    public Person() {
        this.lastName = new SimpleStringProperty("");
        this.firstName = new SimpleStringProperty("");
        this.email = new SimpleStringProperty("");
    }
    
    public Person(String lName, String fName, String email) {
        this.lastName = new SimpleStringProperty(lName);
        this.firstName = new SimpleStringProperty(fName);
        this.email = new SimpleStringProperty(email);
    }
    
    public String getFirstName() {
        return firstName.get();
    }
    
    public void setFirstName(String fName) {
        firstName.set(fName);
    }
    
    public String getLastName() {
        return lastName.get();
    }
    
    public void setLastName(String fName) {
        lastName.set(fName);
    }
    
    public String getEmail() {
        return email.get();
    }
    
    public void setEmail(String fName) {
        email.set(fName);
    }
    
}
    