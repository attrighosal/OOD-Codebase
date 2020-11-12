package Guitar_Shop;

import Guitar_Shop.Inventory; 
import Guitar_Shop.Type; 
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
        Guitar guitar = inventory.search(whatErinLikes); 
        if(guitar != null){ 
            System.out.println("Guitar Found");
        } 
        else 
            System.out.println("Sorry, Erin, we have nothing for you"); 
    }


}
