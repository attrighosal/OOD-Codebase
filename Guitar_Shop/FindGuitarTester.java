package Guitar_Shop;

import Guitar_Shop.Inventory; 
import Guitar_Shop.Type;

import java.util.Iterator;
import java.util.List;

import Guitar_Shop.Builder; 
import Guitar_Shop.Wood;

public class FindGuitarTester {  

    public static void initializeInventory(Inventory inventory){ 
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER); 
        inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }

    public static void main(String[] args) { 

        Inventory inventory = new Inventory(); 
        initializeInventory(inventory);
        Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER); 
        List matchingGuitars = inventory.search(whatErinLikes); 
        if(!matchingGuitars.isEmpty()){ 
            System.out.println("Erin, you might like these guitars: ");
            for(Iterator i = matchingGuitars.iterator(); i.hasNext();){ 
                Guitar guitar = (Guitar)i.next(); 
                System.out.println("We have a "+guitar.getBuilder()+" "+
                guitar.getModel()+" "+guitar.getType()+" "+"guitar: \n"+ 
                guitar.getBackWood()+" back and sides\n"+guitar.getTopWood()+" top\n"+ 
                "You can have it only for $"+guitar.getPrice()+"!\n ------------");
            }
        }
        else 
            System.out.println("Sorry, Erin, we have nothing for you"); 
    }


}
