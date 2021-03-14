package game.gsf.board; 

import java.util.ArrayList; 
import java.util.Iterator; 
import java.util.List; 

import game.gsf.unit.Unit;

public class Board {
    
    private int width, height; 
    private List tiles; 

    public void Board(int width, int height){
        this.width = width; 
        this.height = height; 
        initialise(); 
    } 

    private void initialise(){
        tiles = new ArrayList(width); 
        for(int i=0; i<width; i++){ 
            tiles.add(i, new ArrayList(height)); 
            for(int j=0; j<height; j++){
                ((ArrayList)tiles.get(i)).add(j, new Tile()); 
            }
        }
    } 

    public Tile getTile(int x, int y){
        return (Tile)((ArrayList)tiles.get(x-1)).get(y-1); 
    } 

    public void addUnit(int x, int y, Unit unit){
        Tile tile = (Tile)((ArrayList)tiles.get(x-1)).get(y-1); 
        tile.addUnit(unit); 
    } 

    public void removeUnit(int x, int y, Unit unit){
        Tile tile = (Tile)((ArrayList)tiles.get(x-1)).get(y-1); 
        tile.removeUnit(unit);
    } 

    public void removeUnits(int x, int y){
        Tile tile = (Tile)((ArrayList)tiles.get(x-1)).get(y-1); 
        tile.removeUnits();
    } 

    public List getUnits(int x, int y){
        return this.getTile(x, y).getUnits(); 
    }
}
