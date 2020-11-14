package Guitar_Shop;

public class GuitarSpec {
    private Builder builder; 
    private String model; 
    private Type type; 
    private int numStrings; 
    private Wood backWood, topWood; 


    GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood){ 
        this.builder = builder; 
        this.model = model; 
        this.type = type; 
        this.numStrings = numStrings;  
        this.backWood = backWood; 
        this.topWood = topWood; 
    } 

    public Builder getBuilder(){ 
        return this.builder; 
    } 

    public String getModel(){ 
        return this.model; 
    } 

    public Type getType(){ 
        return this.type; 
    } 
    
    public int getNumStrings(){ 
        return this.numStrings; 
    }

    public Wood getTopWood(){ 
        return this.topWood; 
    }  

    public Wood getBackWood(){ 
        return this.backWood;
    } 
    
    public boolean matches(GuitarSpec otherSpec){ 
        if(this.builder != otherSpec.getBuilder())
            return false;
        String model = otherSpec.getModel(); 
        if((model != null) && (!model.equals("")) && (!model.equals(otherSpec.getModel()))) 
            return false;
        if(this.type != otherSpec.getType())
            return false; 
        if(this.numStrings != otherSpec.getNumStrings())
            return false; 
        if(this.topWood != otherSpec.getTopWood()) 
            return false;
        if(this.backWood != otherSpec.getBackWood())  
            return false; 
        return true; 
    }
}
