package Guitar_Shop; 

import java.lang.String; 
import java.util.*; 

import Guitar_Shop.Guitar;

public class Inventory { 
    private List guitars; 

    public Inventory(){ 
        this.guitars = new LinkedList();
    } 

    public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood){ 
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood); 
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

    public List search(Guitar searchGuitar){ 
        List matchingGuitars = new LinkedList(); 
        for(Iterator i = this.guitars.iterator(); i.hasNext();){ 
            Guitar guitar = (Guitar)i.next(); 
            if(searchGuitar.getBuilder() != guitar.getBuilder())
                continue; 
            String model = searchGuitar.getModel(); 
            if((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel()))) 
                continue; 
            if(searchGuitar.getType() != guitar.getType())
                continue; 
            if(searchGuitar.getTopWood() != guitar.getTopWood())
                continue; 
            if(searchGuitar.getBackWood() != guitar.getBackWood()) 
                continue; 
            matchingGuitars.add(guitar); 
        } 
        return matchingGuitars;
    }
}
