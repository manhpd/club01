package sg.edu.nus.iss.club;



/**
 * 
 */
public class Facility {

    /**
     * Default constructor
     */
    public Facility() {
    }

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String description;

    /**
     * @param name
     */
    public  Facility(String name) {
        // TODO implement here
    }

    /**
     * @param name 
     * @param description
     */
    public  Facility(String name, String description) {
        // TODO implement here
    	this.name = name;
    	this.description = description;
    }

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return this.name;
    }

    /**
     * @return
     */
    public String getDescription() {
        // TODO implement here
        return this.description;
    }

    /**
     * 
     */
    public void show() {
        // TODO implement here
    	System.out.println(this.toString());
    }
    
    public String toString() {
    	return "Name: " + getName() + "\nDescription: " + getDescription();
    }

}