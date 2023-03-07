package edu.utsa.cs3443.rye747_lab3.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class is responsible for implementing the necessary methods for Team class objects. This class contains an ArrayList of Avenger class objects.
 *
 * @author William Clifford rye747
 */
public class Team {
    private ArrayList<Avenger> team;

    /**
     * The Team class toString method returns a formatted String representation of the Team class team ArrayList
     *
     * @return the String representation of the Team class team ArrayList
     */
    public String toString(){
        String teamString = "";
        for(int i = 0; i < team.size(); ++i){
            teamString += team.get(i).toString();
        }
        return teamString;
    }

    /**
     * The Team class loadAvengers method takes in an AssetManager class object as a parameter and opens an input stream using the AssetManager object to take in data from the data.csv asset in order to create Avenger class objects for the team ArrayList
     *
     * @param manager the AssetManager class object used to load the data.csv asset
     */
    public void loadAvengers(AssetManager manager){
        if(team == null){
            team = new ArrayList<>();
        }

        Scanner read;
        try {
            InputStream inFile = manager.open("data.csv");
            read = new Scanner(inFile);
            String line;
            String[] lineTokens;

            while (read.hasNextLine()) {
                line = read.nextLine();
                lineTokens = line.split(",");
                team.add(new Avenger(lineTokens[0], lineTokens[1], lineTokens[3] + "," + lineTokens[4], lineTokens[5], lineTokens[6], lineTokens[7]));
            }

            read.close();
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    /**
     * The Team class getAvenger method takes in a String type search parameter and uses it to find a matching value from the team ArrayList Avenger objects alias attribute. Upon finding a match the Avenger object found to match is returned. If no match is found an Avenger object is created with default attribute values and is returned.
     *
     * @param search the value used for comparison to find a matching Avenger object alias attribute
     * @return the Avenger object containing the matching alias attribute, if no match is found an Avenger object with default values is returned
     */
    public Avenger getAvenger(String search){
        boolean hasMatch = false;
        int matchInd = 0;
        for(int i = 0; i < team.size(); ++i) {
            if(team.get(i).getAlias().equals(search)) {
                matchInd = i;
                hasMatch = true;
            }
        }
        if(hasMatch){
            return team.get(matchInd);
        }
        else{
            return (new Avenger());
        }
    }
}
