import processing.core.PApplet;
import processing.core.PVector;
import processing.core.*;

public class Tile extends PApplet {

    boolean wall = false;
    boolean dot = false;
    boolean bigDot = false;
    boolean eaten = false;
    PVector pos;

    //constructor
    public Tile(float x, float y) {
        pos = new PVector(x, y);
    }
    //-----------------------------------------------------------------------------------------------------------------------------------------------

    //draw a dot if there is one in this tile
    public void show() {
        /*    if (dot) {
                if (!eaten) {//draw dot
                    fill(255, 255, 0);
                    noStroke();
                    ellipse(pos.x, pos.y, 3, 3);
                }
            } else if (bigDot) {
                if (!eaten) {//draw big dot
                    fill(255, 255, 0);
                    noStroke();
                    ellipse(pos.x, pos.y, 6, 6);
                }
            }
            */
    }
}