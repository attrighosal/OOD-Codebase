package Guitar_Shop;

public enum Style {
    A, F; 

    public String toString(){
        switch(this){
            case A: return "A"; 
            case F: return "F"; 
            default: return null; 
        }
    }
}
