import processing.core.PApplet;
import processing.core.PVector;

public class Pacman extends PApplet {
    public PVector pos;
    public PVector turnTo = new PVector(-1,0);
    public boolean turn = false;
    PVector vel = new PVector(-1, 0);

    private int a;
    private int b;
    private int d = 40;

    private int x;
    private int y;
    private int maxX;
    private int maxY;


    public Pacman(){
        pos = new PVector(1316+8,2316+8);
        fill(255, 255, 0);
        stroke(255,255,0);
        arc(a,height/2, d, d,PI/4, 7*PI/4);
    }

    void move() {
        pos.add(vel);
    }

    public void keyPressed(){
        switch (key){
            case CODED:
                switch (keyCode){
                    case UP:
                        turnTo = new PVector(0,-1);
                        turn = true;
                        break;
                    case DOWN:
                        turnTo = new PVector(0,1);
                        turn = true;
                        break;
                    case RIGHT:
                        turnTo = new PVector(1,0);
                        turn = true;
                        break;
                    case LEFT:
                        turnTo = new PVector(-1,0);
                        turn = true;
                        break;
                    default:
                        turnTo = new PVector(0,-1);
                        turn = false;
                        break;
                }
        }
    }


    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }


    public void show() {
        fill(255, 255, 0);
        stroke(255,255,0);
        arc(a,height/2, d, d,PI/4, 7*PI/4);
    }
}