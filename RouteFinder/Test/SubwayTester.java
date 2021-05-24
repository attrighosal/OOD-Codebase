package Test;

import java.io.File;
import java.util.List;

import Loader.SubwayLoader;
import Printer.SubwayPrinter;
import Subway.Subway;

public class SubwayTester {
    
    public static void main(String[] args) {
        
        try{
            SubwayLoader loader = new SubwayLoader(); 
            Subway objectville = loader.loadFromFile(new File("Test//ObjectvilleSubway.txt")); 
            String startStationName = "Ajax Rapids", endStationName = "Objectville Pizzastore"; 
            if(!objectville.hasStation(startStationName)){
                System.out.println(startStationName+" is not a valid station in Objectville"); 
                System.exit(-1); 
            } 
            else if(!objectville.hasStation(endStationName)){
                System.out.println(endStationName+" is not a valid station in Objectville"); 
                System.exit(-1); 
            } 
            List route = objectville.getDirections(startStationName, endStationName); 
            SubwayPrinter printer = new SubwayPrinter(System.out); 
            printer.printDirections(route); 
        } 
        catch(Exception e){
            e.printStackTrace(System.out);
        }
    }
}
