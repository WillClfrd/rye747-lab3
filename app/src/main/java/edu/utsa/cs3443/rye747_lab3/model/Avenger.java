package edu.utsa.cs3443.rye747_lab3.model;

/**
 * This class inherits the Person class and is responsible for implementing necessary methods for Avenger class objects.
 *
 * @author William Clifford rye747
 */
public class Avenger extends Person{
    private String alias;
    private Boolean hasPow;
    private String location;

    /**
     * This Avenger class constructor instantiates an Avenger class object by calling the Person class constructor with the specified name, height, and weight values and by assigning the specified alias, hasPow, and location values
     *
     * @param name the given value to be assigned to the Avenger object name attribute
     * @param alias the given value to be assigned to the Avenger object alias attribute
     * @param height the given value to be assigned to the Avenger object height attribute
     * @param weight the given value to be assigned to the Avenger object weight attribute
     * @param hasPow the given value to be assigned to the Avenger object hasPow attribute
     * @param location the given value to be assigned to the Avenger object location attribute
     */
    public Avenger(String name, String alias, String height, String weight, String hasPow, String location){
        super(name, height, weight);
        this.alias = alias;
        this.location = location;
        this.hasPow = (hasPow.equals("T"));
    }

    /**
     * This Avenger class constructor instantiates an Avenger class object with default values for all attributes
     */
    public Avenger(){
        super();
        this.alias = "No Value";
        this.location = "No Value";
        this.hasPow = false;
    }

    /**
     * The Avenger class toString method returns a formatted String representation of the Person class name, height, and weight attributes and the Avenger class alias, location, and hasPow attributes
     *
     * @return the String representation of the Person class name, height, and weight attributes and the Avenger class alias, location, and hasPow attributes
     */
    public String toString(){
        return super.toString() + "\n\tAlias: " + this.alias + "\n\tLocation: " + this.location + "\n\tHas Powers: " + this.getHasPowValue() + "\n";
    }

    /**
     * The Avenger class getAlias method returns the Avenger object Alias attribute
     *
     * @return the String type Avenger object alias attribute
     */
    public String getAlias(){
        return this.alias;
    }

    /**
     * The Avenger class getWeight method returns the Avenger object weight attribute
     *
     * @return the String type Avenger object weight attribute
     */
    public Boolean getHasPow(){
        return this.hasPow;
    }

    /**
     * The Avenger class getWeight method returns the Avenger object weight attribute
     *
     * @return the String type Avenger object weight attribute
     */
    public String getHasPowValue() {
        return (this.hasPow)?"True":"False";
    }

    /**
     * The Avenger class getWeight method returns the Avenger object weight attribute
     *
     * @return the String type Avenger object weight attribute
     */
    public String getLocation(){
        return this.location;
    }

    /**
     * The Avenger class setName method sets the Avenger object name attribute to the specified value
     *
     * @return the value to be assigned to the Avenger object name attribute
     */
    public void setAlias(String alias){
        this.alias = alias;
    }

    /**
     * The Avenger class setName method sets the Avenger object name attribute to the specified value
     *
     * @return the value to be assigned to the Avenger object name attribute
     */
    public void setHasPow(Boolean hasPow){
        this.hasPow = hasPow;
    }

    /**
     * The Avenger class setName method sets the Avenger object name attribute to the specified value
     *
     * @return the value to be assigned to the Avenger object name attribute
     */
    public void setLocation(String location){
        this.location = location;
    }

}
