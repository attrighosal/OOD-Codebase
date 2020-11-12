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

    public Guitar search(Guitar searchGuitar){ 
        for(Iterator i = this.guitars.iterator(); i.hasNext();){ 
            Guitar guitar = (Guitar)i.next(); 
            String builder = searchGuitar.getBuilder(); 
            if((builder != null) && (!builder.equals("")) && (!builder.equals(guitar.getBuilder()))) 
                continue; 
            String model = searchGuitar.getModel(); 
            if((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel()))) 
                continue; 
            String type = searchGuitar.getType(); 
            if((type != null) && (!type.equals("")) && (!type.equals(guitar.getType()))) 
                continue; 
            String topWood = searchGuitar.getTopWood(); 
            if((topWood != null) && (!topWood.equals("")) && (!topWood.equals(guitar.getTopWood()))) 
                continue; 
            String backWood = searchGuitar.getBackWood(); 
            if((backWood != null) && (!backWood.equals("")) && (!backWood.equals(guitar.getBackWood()))) 
                continue;  
        } 

        return null;
    }
}
