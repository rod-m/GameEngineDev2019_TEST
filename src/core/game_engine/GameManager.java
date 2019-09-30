package core.game_engine;
import processing.core.PApplet;
import java.util.ArrayList;
public class GameManager {
    public PApplet parent;
    private ArrayList<GameObject> gameObjects;
    public GameManager(PApplet p){
        this.parent = p;
        this.reset();
    }
    public void reset(){
        this.gameObjects = new ArrayList<GameObject>();
    }
    public void add_game_object(GameObject g){
        this.gameObjects.add(g);
    }
    public void update_all(){
        for(int i = 0; i < this.gameObjects.size(); i++){
            //update all game objects
            GameObject g = this.gameObjects.get(i);
            g.update();
        }
    }
}
