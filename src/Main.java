import core.game_engine.*;
import processing.core.PApplet;
public class Main extends PApplet{
    private int WIDTH = 600, HEIGHT = 400;
    private GameObject gameObject;
    private GameManager gameManager;
    public void settings(){
        size(WIDTH, HEIGHT);
    }
    public void setup()
    {
        gameManager = new GameManager(this);
        gameObject = new GameObject(this);
        gameObject.position. x = 50;
        gameManager.add_game_object(gameObject);

        GameObject g2 = new GameObject(this);
        g2.position.x = 250;
        gameManager.add_game_object(g2);
    }
    public void draw(){
        background(0);
        gameManager.update_all();
    }
    public static void main(String args[]){
        //System.out.println("Hello world");
        PApplet.main("Main");
    }
}
