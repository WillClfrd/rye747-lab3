package edu.utsa.cs3443.rye747_lab3.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Team {
    public ArrayList<Avenger> team;

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

    public Avenger getAvenger(String alias){
        boolean hasMatch = false;
        int matchInd = 0;
        for(int i = 0; i < team.size(); ++i) {
            if(team.get(i).getAlias().equals(alias)) {
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
