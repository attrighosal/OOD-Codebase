package Loader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import Subway.Subway;

public class SubwayLoader { 

    private Subway subway;

    public SubwayLoader(){
        this.subway = new Subway(); 
    } 

    public Subway loadFromFile(File subwayFile) throws IOException{
        
        BufferedReader reader = new BufferedReader(new FileReader(subwayFile)); 
        loadStations(this.subway, reader); 
        String lineName = reader.readLine(); 
        while((lineName != null) && (lineName.length()>0)){
            loadLine(this.subway, lineName, reader); 
            lineName = reader.readLine(); 
        } 
        return this.subway; 
    } 

    private void loadStations(Subway subway, BufferedReader reader) throws IOException{ 

        String currentLine; 
        currentLine = reader.readLine(); 
        while(currentLine.length()>0){
            subway.addStation(currentLine); 
            currentLine = reader.readLine(); 
        }
    } 

    private void loadLine(Subway subway, String lineName, BufferedReader reader) throws IOException{
        String stationName1, stationName2; 
        stationName1 = reader.readLine(); 
        stationName2 = reader.readLine(); 
        while(stationName2 != null && stationName2.length()>0){
            subway.addConnection(stationName1, stationName2, lineName); 
            stationName1 = stationName2; 
            stationName2 = reader.readLine(); 
        }
    }
    
}
