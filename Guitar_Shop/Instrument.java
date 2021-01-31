package Guitar_Shop;

public  abstract class Instrument {
    
    private String serialNumber; 
    private double price; 
    private InstrumentSpec spec; 

    public Instrument(String serialNumber, double price, InstrumentSpec spec){
        this.serialNumber = serialNumber; 
        this.price = price; 
        this.spec = spec; 
    } 

    String getSerialNumber(){
        return this.serialNumber; 
    } 

    double getPrice(){
        return this.price; 
    } 

    InstrumentSpec getSpec(){
        return this.spec; 
    }
}
