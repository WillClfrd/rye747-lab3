package edu.utsa.cs3443.rye747_lab3.model;

public class Avenger extends Person{
    private String alias;
    private Boolean hasPow;
    private String location;
    public Avenger(String name, String alias, String height, String weight, String hasPow, String location){
        this.setName(name);
        this.setHeight(height);
        this.setWeight(weight);
        this.alias = alias;
        this.location = location;
        this.hasPow = (hasPow.equals("T"));
    }

    public Avenger(){
        this.setName("No Value");
        this.setHeight("No Value");
        this.setWeight("No Value");
        this.alias = "No Value";
        this.location = "No Value";
        this.hasPow = false;
    }

    public String getAlias(){
        return this.alias;
    }

    public Boolean getHasPow(){
        return this.hasPow;
    }

    public String getLocation(){
        return this.location;
    }

    public void setAlias(String alias){
        this.alias = alias;
    }

    public void setTFVal(Boolean hasPow){
        this.hasPow = hasPow;
    }

    public void setLocation(String location){
        this.location = location;
    }

}
