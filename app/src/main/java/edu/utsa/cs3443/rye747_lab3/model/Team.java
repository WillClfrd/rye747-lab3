package edu.utsa.cs3443.rye747_lab3.model;

import android.content.res.AssetManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Team {
    private ArrayList<Avenger> team = new ArrayList<Avenger>();

    public void loadAvengers(AssetManager manager) throws FileNotFoundException{
        String filePath = "Hello";
        File inFile = new File(filePath);
        try {
            Scanner read = new Scanner(inFile);
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
}
