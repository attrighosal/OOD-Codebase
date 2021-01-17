package Dog_Door;

import java.util.ArrayList;
import java.util.Iterator;

public class BarkRecognizer {
    
    private DogDoor door; 

    public BarkRecognizer(DogDoor door){ 
        this.door = door; 
    } 

    public void recognize(Bark bark){
        System.out.println("    Barkrecognizer : Heard a '"+bark.getSound()+"'"); 
        ArrayList<Bark> allowedBarks = this.door.getBarks(); 
        for(Iterator i = allowedBarks.iterator(); i.hasNext(); ){ 
            Bark allowedBark = (Bark)i.next(); 
            if(allowedBark.equals(bark)){
                door.open(); 
                return;
            }
        } 
        System.out.println("This dog is not allowed.");  
    }

}
