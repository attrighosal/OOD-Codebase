package Guitar_Shop;

public abstract class InstrumentSpec {
    
    private Builder builder; 
    private String model; 
    private Type type; 
    private Wood backWood, topWood; 

    public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood){
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

    public boolean matches(InstrumentSpec otherSpec){
        if(this.builder != otherSpec.getBuilder())
            return false;
        String model = otherSpec.getModel(); 
        if((model != null) && (!model.equals("")) && (!model.equals(otherSpec.getModel()))) 
            return false;
        if(this.type != otherSpec.getType())
            return false; 
        if(this.topWood != otherSpec.getTopWood()) 
            return false;
        if(this.backWood != otherSpec.getBackWood())  
            return false; 
        return true;
    }

}
