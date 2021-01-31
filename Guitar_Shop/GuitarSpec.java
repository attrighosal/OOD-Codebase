package Guitar_Shop;

public class GuitarSpec extends InstrumentSpec{
    private int numStrings; 

    public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood){ 
        super(builder, model, type, backWood, topWood); 
        this.numStrings = numStrings;  
    } 

    public int getNumStrings(){ 
        return this.numStrings; 
    } 

    public boolean matches(GuitarSpec otherSpec){ 
        if(!super.matches(otherSpec))
            return false; 
        if(!(otherSpec instanceof GuitarSpec)) 
            return false; 
        GuitarSpec spec = (GuitarSpec)otherSpec; 
        if(this.numStrings != spec.getNumStrings())
            return false; 
        return true; 
    }
}
