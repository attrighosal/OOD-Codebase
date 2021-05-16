package game.gsf.unit;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import game.gsf.unit.Weapon;

public class Unit {
    
    private String type; 
    private int id; 
    private String name; 
    private List<Weapon> weapons; 
    private Map<String, Object> properties;  

    public Unit(int id){
        this.id = id; 
    } 

    public int getId(){
        return this.id;
    } 

    public void setType(String type){
        this.type = type; 
    } 

    public String getType(){ 
        return this.type; 
    } 

    public void setName(String name){
        this.name = name; 
    } 

    public String getName(){ 
        return this.name; 
    } 

    public void addWeapon(Weapon weapon){
        if(this.weapons == null){ 
            this.weapons = new LinkedList<>(); 
        }
        this.weapons.add(weapon); 
    } 

    public List<Weapon> getWeapons(){
        return this.weapons; 
    }  

    public void setProperty(String property, Object value){
        if(this.properties == null){ 
            this.properties = new HashMap<>(); 
        }
        this.properties.put(property, value);  
    } 

    public Object getProperty(String property){
        return this.properties==null ? null : this.properties.get(property); 
    }

}
