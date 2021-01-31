package Guitar_Shop; 

import java.util.HashMap;
import java.util.Iterator; 
import java.util.Map;
import java.util.List;

public class FindInstrument {  

    public static void main(String[] args) { 

        Inventory inventory = new Inventory(); 
        initializeInventory(inventory); 

        Map properties = new HashMap(); 
        properties.put("builder", Builder.COLLINGS); 
        properties.put("backWood", Wood.CITKA); 
        InstrumentSpec clientSpec = new InstrumentSpec(properties);   

        List matchingInstruments = inventory.search(clientSpec); 
        if(!matchingInstruments.isEmpty()){ 
            for(Iterator i = matchingInstruments.iterator(); i.hasNext();){ 
                Instrument instrument = (Instrument)i.next(); 
                InstrumentSpec instrumentSpec = instrument.getSpec(); 
                System.out.println("We have a "+instrumentSpec.getProperty("instrumentType")+" with the following properties : "); 
                for(Iterator j = instrumentSpec.getProperties().keySet().iterator(); j.hasNext();){ 
                    String propertyName = (String)j.next(); 
                    if(propertyName.equals("instrumentType")) 
                        continue;   
                    System.out.println("    "+propertyName+" : "+instrumentSpec.getProperty(propertyName));
                } 
                System.out.println("You can have this "+instrumentSpec.getProperty("instrumentType")+" only for $"+instrument.getPrice()+"!\n ----"); 
            }
        }
        else 
            System.out.println("Sorry, we have nothing for you"); 
    }

    public static void initializeInventory(Inventory inventory){ 
        Map properties = new HashMap(); 
        properties.put("instrumentType", InstrumentType.GUITAR); 
        properties.put("builder", Builder.COLLINGS); 
        properties.put("model", "CJ"); 
        properties.put("type", Type.ACOUSTIC); 
        properties.put("numStrings", 6); 
        properties.put("topWood", Wood.INDIAN_ROSEWOOD); 
        properties.put("backWood", Wood.CITKA);   
        inventory.addInstrument("11277", 3999.95, new InstrumentSpec(properties)); 
        // inventory.addInstrument("V9512", 1549.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);
    }

}
