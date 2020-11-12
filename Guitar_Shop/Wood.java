package Guitar_Shop;

public enum Wood { 

    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, CITKA; 

    public String toString(){ 
        switch(this){ 
            case INDIAN_ROSEWOOD: return "Indian Rosewood"; 
            case BRAZILIAN_ROSEWOOD: return "Brazilian Rosewood"; 
            case MAHOGANY: return "Mahogany"; 
            case MAPLE: return "Maple"; 
            case COCOBOLO: return "Cocobolo"; 
            case CEDAR: return "Cedar"; 
            case ADIRONDACK: return "Adironack"; 
            case ALDER: return "Alder"; 
            case CITKA: return "Citka"; 
            default: return "Wood Unavailable"; 
        }
    }
}
