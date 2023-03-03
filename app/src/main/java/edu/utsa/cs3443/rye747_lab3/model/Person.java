package edu.utsa.cs3443.rye747_lab3.model;

public abstract class Person {
    private String name;
    private String height;
    private String weight;

    public String getName(){
        return this.name;
    }

    public String getHeight(){
        return this.height;
    }

    public String getWeight(){
        return this.weight;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHeight(String height){
        this.height = height;
    }

    public void setWeight(String weight){
        this.weight = weight;
    }
}
