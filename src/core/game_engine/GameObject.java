package core.game_engine;
import processing.core.PApplet;
import processing.core.PVector;

public class GameObject {
    public PApplet parent;
    public PVector position = new PVector(0,0,0);
    public GameObject(PApplet p){
        this.parent = p;
    }
    public void update(){
        parent.rect(this.position.x, this.position.y, 100,20);
    }
}
