package Guitar_Shop; 

import java.lang.String; 
import java.util.*; 

public class Inventory { 
    private List inventory; 

    public Inventory(){ 
        this.inventory = new LinkedList();
    } 

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec){ 
        Instrument instrument = new Instrument(serialNumber, price, spec); 
        inventory.add(instrument); 
    } 

    public Instrument getInstrument(String serialNumber){ 
        for(Iterator i= this.inventory.iterator(); i.hasNext();){ 
            Instrument instrument = (Instrument)i.next(); 
            if(instrument.getSerialNumber().equals(serialNumber)) 
                return instrument;
        } 
        return null;
    } 

    public List search(InstrumentSpec searchSpec){ 
        List matchingInstruments = new LinkedList(); 
        for(Iterator i = this.inventory.iterator(); i.hasNext();){ 
            Instrument instrument = (Instrument)i.next(); 
            if(instrument.getSpec().matches(searchSpec))
                matchingInstruments.add(instrument); 
        } 
        return matchingInstruments;
    } 
}
