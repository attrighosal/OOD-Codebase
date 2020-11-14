package Guitar_Shop; 

import java.lang.String; 

public class Guitar{ 
    private String serialNumber; 
    private double price; 
    private GuitarSpec guitarSpec; 

    Guitar(String serialNumber, double price, GuitarSpec guitarSpec){
        this.serialNumber = serialNumber; 
        this.price = price; 
        this.guitarSpec = guitarSpec; 
    } 

    public String getSerialNumber(){ 
        return this.serialNumber; 
    } 

    public double getPrice(){ 
        return this.price; 
    } 

    public GuitarSpec getSpec(){ 
        return this.guitarSpec;
    }
}