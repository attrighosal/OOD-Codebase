package Subway;

import Subway.Station;

public class Connection {
    
    private Station station1, station2; 
    private String lineName; 

    public Connection(Station station1, Station station2, String lineName){
        this.station1 = station1; 
        this.station2 = station2; 
        this.lineName = lineName; 
    } 

    public Station getStation1(){
        return this.station1; 
    } 

    public Station getStation2(){
        return this.station2; 
    } 

    public String getLineName(){ 
        return this.lineName; 
    }
}
