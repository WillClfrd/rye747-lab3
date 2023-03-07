package edu.utsa.cs3443.rye747_lab3.model;

/**
 * This class is responsible for implementing necessary methods for Person class objects.
 *
 * @author William Clifford rye747
 */
public abstract class Person {
    private String name;
    private String height;
    private String weight;

    /**
     * This Person class constructor instantiates a Person class object with the specified name, height, and weight values
     *
     * @param name the given value to be assigned to the Person object name attribute
     * @param height the given value to be assigned to the Person object height attribute
     * @param weight the given value to be assigned to the Person object weight attribute
     */
    public Person(String name, String height, String weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    /**
     * This Person class constructor instantiates a Person class object with default values
     */
    public Person(){
        this.name = "No Value";
        this.height = "No Value";
        this.weight = "No Value";
    }

    /**
     * The Person class toString method returns a formatted String representation of the Person class name, height, and weight attributes
     *
     * @return the String representation of the Person class name, height, and weight attributes
     */
    public String toString(){
        return "Name: " + this.name + "\n\tHeight: " + this.height + "\n\tWeight: " + this.weight;
    }

    /**
     * The Person class getName method returns the Person object name attribute
     *
     * @return the String type Person object name attribute
     */
    public String getName(){
        return this.name;
    }

    /**
     * The Person class getHeight method returns the Person object height attribute
     *
     * @return the String type Person object height attribute
     */
    public String getHeight(){
        return this.height;
    }

    /**
     * The Person class getWeight method returns the Person object weight attribute
     *
     * @return the String type Person object weight attribute
     */
    public String getWeight(){
        return this.weight;
    }

    /**
     * The Person class setName method sets the Person object name attribute to the specified value
     *
     * @return the value to be assigned to the Person object name attribute
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * The Person class setHeight method sets the Person object height attribute to the specified value
     *
     * @return the value to be assigned to the Person object height attribute
     */
    public void setHeight(String height){
        this.height = height;
    }

    /**
     * The Person class setWeight method sets the Person object weight attribute to the specified value
     *
     * @return the value to be assigned to the Person object weight attribute
     */
    public void setWeight(String weight){
        this.weight = weight;
    }
}
