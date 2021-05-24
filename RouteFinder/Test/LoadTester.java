package Test;

import java.io.File;

import Loader.SubwayLoader;
import Subway.Subway;

public class LoadTester { 

    public static void main(String[] args){
        
        try{
            SubwayLoader subwayLoader = new SubwayLoader(); 
            Subway objectville = subwayLoader.loadFromFile(new File("Test//ObjectvilleSubway.txt")); 
            System.out.println("Testing stations..."); 
            if(objectville.hasStation("Ajax Rapids") &&
            objectville.hasStation("HTML Heights") && 
            objectville.hasStation("JavaBeans Boulevard")){
                System.out.println("...station test passed successfully"); 
            } 
            else{
                System.out.println("...station test FAILED."); 
                System.exit(-1);
            } 

            System.out.println("\nTesting connections"); 
            if(objectville.hasConnection("Ajax Rapids", "HTML Heights", "Booch Line") && 
            objectville.hasConnection("HTML Heights", "Ajax Rapids", "Booch Line") && 
            objectville.hasConnection("Head First Labs", "Objectville Pizzastore", "Gamma Line")){
                System.out.println("...connection test passed successfully");
            } 
            else{ 
                System.out.println("...connection test FAILED."); 
                System.exit(-1); 
            }

        }
        catch(Exception e ){
            e.printStackTrace(System.out);
        }
    }
}
