package edu.utsa.cs3443.rye747_lab3.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

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

        if(hasPow.equals("T")){
            this.hasPow = true;
        }
        else{
            this.hasPow = false;
        }
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
