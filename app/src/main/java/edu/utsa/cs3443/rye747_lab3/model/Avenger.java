package edu.utsa.cs3443.rye747_lab3.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Avenger {
    private String name;
    private String alias;
    private String gender;
    private String height;
    private String weight;
    private String tfVal;
    private String location;
    public Avenger(String name, String alias, String gender, String height, String weight, String tfVal, String location){
        this.name = name;
        this.alias = alias;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.tfVal = tfVal;
        this.location = location;
    }

    public String getName(){
        return this.name;
    }

    public String getAlias(){
        return this.alias;
    }

    public String getGender(){
        return this.gender;
    }

    public String getHeight(){
        return this.height;
    }

    public String getWeight(){
        return this.weight;
    }

    public String getTFVal(){
        return this.tfVal;
    }

    public String getLocation(){
        return this.location;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAlias(String alias){
        this.alias = alias;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setHeight(String height){
        this.height = height;
    }

    public void setWeight(String weight){
        this.weight = weight;
    }

    public void setTFVal(String tfVal){
        this.tfVal = tfVal;
    }

    public void setLocation(String location){
        this.location = location;
    }

    //this method may need to be moved to AvengersController
    //assign a variable for filePath
    public ArrayList loadAvengers(String filePath) throws FileNotFoundException {
        File inFile = new File(filePath);
        Scanner read = new Scanner(inFile);
        ArrayList<Avenger> Avengers = new ArrayList<Avenger>();
        String line;
        String[] lineTokens;

        while(read.hasNextLine()){
            line = read.nextLine();
            lineTokens = line.split(",");
            //Avenger tempAvenger = new Avenger(lineTokens[0], lineTokens[1], lineTokens[2], lineTokens[3] + "," + lineTokens[4], lineTokens[5], lineTokens[6], lineTokens[7]);
            Avengers.add(new Avenger(lineTokens[0], lineTokens[1], lineTokens[2], lineTokens[3] + "," + lineTokens[4], lineTokens[5], lineTokens[6], lineTokens[7]));
        }

        read.close();
        return Avengers;
    }
}
