package Dog_Door;

public class Bark {
    
    private String sound; 

    Bark(String sound){
        this.sound = sound; 
    }

    public String getSound(){
        return this.sound; 
    } 

    public boolean equals(Bark bark){
        return this.sound.equals(bark.getSound()); 
    }
}
