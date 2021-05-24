package Subway;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Subway { 

    private List stations; 
    private List connections; 
    private Map network; 

    public Subway(){
        this.stations = new LinkedList(); 
        this.connections = new LinkedList(); 
        this.network = new HashMap();  
    } 

    public void addStation(String stationName){
        if(!hasStation(stationName)){ 
            Station station = new Station(stationName); 
            this.stations.add(station); 
        }
    } 

    public boolean hasStation(String stationName){
        return this.stations.contains(new Station(stationName)); 
    } 

    public void addConnection(String stationName1, String stationName2, String lineName) throws RuntimeException{
        if(hasStation(stationName1) && hasStation(stationName2)){
            Station station1 = new Station(stationName1); 
            Station station2 = new Station(stationName2); 
            this.connections.add(new Connection(station1, station2, lineName)); 
            this.connections.add(new Connection(station2, station1, lineName)); 
            addToNetwork(station1, station2); 
            addToNetwork(station2, station1);
        } 
        else{
            throw new RuntimeException("Invalid Station Name"); 
        }
    } 

    public boolean hasConnection(String stationName1, String stationName2, String lineName){
        Station station1 = new Station(stationName1); 
        Station station2 = new Station(stationName2); 

        for(Iterator i = this.connections.iterator(); i.hasNext(); ){
            Connection connection = (Connection)i.next(); 
            if(connection.getLineName().equalsIgnoreCase(lineName)){
                if(connection.getStation1().equals(station1) && 
                connection.getStation2().equals(station2)){
                    return true; 
                }
            }
        } 
        return false; 
    } 

    private void addToNetwork(Station station1, Station station2){
        if(this.network.keySet().contains(station1)){
            List connectingStations = (List)this.network.get(station1); 
            if(!connectingStations.contains(station2)){ 
                connectingStations.add(station2); 
            } 
        } 
        else{
            List connectingStations = new LinkedList(); 
            connectingStations.add(station2); 
            this.network.put(station1, connectingStations); 
        }
    } 

    public List getDirections(String startStationName, String endStationName){
        if(!this.hasStation(startStationName) || 
        !this.hasStation(endStationName)){
            throw new RuntimeException("Stations entered do not exist in the Subway"); 
        } 

        Station start = new Station(startStationName); 
        Station end = new Station(endStationName); 
        List route = new LinkedList(); 
        List reachableStations = new LinkedList(); 
        Map previousStations = new HashMap(); 

        List neighbors = (List)this.network.get(start); 
        for(Iterator i = neighbors.iterator(); i.hasNext(); ){
            Station station = (Station)i.next(); 
            if(station.equals(end)){
                route.add(getConnection(start, end)); 
                return route; 
            } 
            else{ 
                reachableStations.add(station); 
                previousStations.put(station, start);  
            }
        } 

        boolean breakFlag = false; 
        List nextStations = new LinkedList(); 
        nextStations.addAll(neighbors); 
        Station currentStation = start; 
        for(int i=1; i<this.stations.size(); i++){ 
            List tmpNextStations = new LinkedList(); 
            for(Iterator j = nextStations.iterator(); j.hasNext(); ){ 
                Station station = (Station)j.next(); 
                reachableStations.add(station); 
                currentStation = station; 
                List currentNeighbors = (List)this.network.get(currentStation); 
                for(Iterator k = currentNeighbors.iterator(); k.hasNext(); ){ 
                    Station neighbor = (Station)k.next(); 
                    if(neighbor.equals(end)){ 
                        reachableStations.add(neighbor); 
                        previousStations.put(neighbor, currentStation); 
                        breakFlag = true; 
                        break; 
                    } 
                    else if(!reachableStations.contains(neighbor)){
                        reachableStations.add(neighbor); 
                        tmpNextStations.add(neighbor); 
                        previousStations.put(neighbor, currentStation); 
                    }
                } 
                if(breakFlag){
                    break;
                }
            } 
            if(breakFlag){
                break;
            } 
            nextStations = tmpNextStations; 
        } 

        boolean keepLooping = true; 
        Station keyStation = end; 
        Station station; 

        
        while(keepLooping){
            station = (Station)previousStations.get(keyStation); 
            route.add(0, getConnection(station, keyStation)); 
            if(start.equals(station)){
                keepLooping = false; 
            }
            keyStation = station;  
        } 
        return route; 
    } 

    private Connection getConnection(Station station1, Station station2){ 

        for(Iterator i = this.connections.iterator(); i.hasNext(); ){ 
            Connection connection = (Connection)i.next(); 
            Station one = connection.getStation1(); 
            Station two = connection.getStation2(); 
            if((station1.equals(one)) && station2.equals(two)){
                return connection; 
            }
        } 
        return null; 
    }
}
