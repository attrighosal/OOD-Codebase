package Guitar_Shop;

public class GuitarSpec {
    private Builder builder; 
    private String model; 
    private Type type; 
    private Wood backWood, topWood; 


    GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood){ 
        this.builder = builder; 
        this.model = model; 
        this.type = type; 
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

    public Wood getTopWood(){ 
        return this.topWood; 
    }  

    public Wood getBackWood(){ 
        return this.backWood;
    } 
}
