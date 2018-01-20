package sg.edu.nus.iss.club;


/**
 * 
 */
public class Person {

    /**
     * Default constructor
     */
    public Person() {
    }

    /**
     * 
     */
    private String surname;

    /**
     * 
     */
    private String firstName;

    /**
     * 
     */
    private String secondName;

    /**
     * @param surname 
     * @param firstName 
     * @param secondName
     */
    public Person(String surname, String firstName, String secondName) {
        // TODO implement here
    	this.surname = surname;
    	this.firstName = firstName;
    	this.secondName = secondName;
    }

    /**
     * @return
     */
    public String getSurname() {
        // TODO implement here
        return this.surname;
    }

    /**
     * @return
     */
    public String getFirstName() {
        // TODO implement here
        return this.firstName;
    }

    /**
     * @return
     */
    public String getSecondName() {
        // TODO implement here
        return this.secondName;
    }

    /**
     * @return 
     * 
     */
    public String toString() {
        // TODO implement here
    	return "Surname: " + this.surname + "\nFirstname: " + this.firstName + "\nSecondName: " + this.secondName;
    }
    
    public void show() {
        // TODO implement here
    	System.out.println(this.toString());
    }

}