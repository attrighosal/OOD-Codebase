package Guitar_Shop; 

import java.lang.String; 
import java.util.*; 

public class Inventory { 
    private List guitars; 

    public Inventory(){ 
        this.guitars = new LinkedList();
    } 

    public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, int numStrings,  Wood backWood, Wood topWood){ 
        GuitarSpec guitarSpec = new GuitarSpec(builder, model, type, numStrings, backWood, topWood); 
        Guitar guitar = new Guitar(serialNumber, price, guitarSpec); 
        guitars.add(guitar); 
    } 

    public Guitar getGuitar(String serialNumber){ 
        for(Iterator i= this.guitars.iterator(); i.hasNext();){ 
            Guitar guitar = (Guitar)i.next(); 
            if(guitar.getSerialNumber().equals(serialNumber)) 
                return guitar;
        } 
        return null;
    } 

    public List search(GuitarSpec searchSpec){ 
        List matchingGuitars = new LinkedList(); 
        for(Iterator i = this.guitars.iterator(); i.hasNext();){ 
            Guitar guitar = (Guitar)i.next(); 
            GuitarSpec guitarSpec = guitar.getSpec(); 
            if(guitarSpec.matches(searchSpec))
                matchingGuitars.add(guitar); 
        } 
        return matchingGuitars;
    }
}
