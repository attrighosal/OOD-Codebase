package game.gsf.board;

import java.util.LinkedList;
import java.util.List;

import game.gsf.unit.Unit;

public class Tile {
    
    private List units; 

    public void Tile(){
        this.units = new LinkedList(); 
    } 

    protected void addUnit(Unit unit){
        this.units.add(unit); 
    } 

    protected void removeUnit(Unit unit){
        this.units.remove(units); 
    } 

    protected void removeUnits(){
        this.units.clear();
    } 

    protected List getUnits(){
        return this.units; 
    }

}
