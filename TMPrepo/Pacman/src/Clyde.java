import org.w3c.dom.*;
import processing.core.PVector;

import java.nio.file.Path;
import java.util.ArrayList;

//random rundt om pacman
//2 modes
// - chase: De jagter pacman
// - scatter, de går tilbage i deres hjørne i et kort øjeblik før de igen chaser
public class Clyde extends Ghost {
    boolean chase;
    boolean scatter;
    int millis = millis();
    int chaseCounter = 0;


    PVector vel = new PVector(1,0);
    Path path;
    ArrayList<Node> clydePath = new ArrayList<Node>();
    Node pathStart;
    Node pathEnd;
    Tile[][] tiles;


    private boolean returnHome;
    Pacman pacman;

    public Clyde(PVector pos) {
        super(pos);
        setPath();
    }
    public static PVector pos(){
        PVector pos = new PVector(1*16 +8, 29*16+8);
        return pos;
    }

    private void setPath() {
        clydePath.clear();
        setNodes();
        pathStart = clydePath.get(0);
        pathEnd = clydePath.get(clydePath.size()-1);

    }

    private void setNodes() {
        float newXpos = (pos.x - 8) / 16;
        float newYpos = (pos.y - 8) / 16;
        clydePath.add(new Node(newXpos, newYpos));

        for (int i = 1; i < 27; i++) {
            for (int j = 1; j < 30; j++) {
                if (!tiles[j][i].wall) {
                    if (!tiles[j - 1][i].wall || !tiles[j + 1][i].wall) {
                        if (!tiles[j][i - 1].wall || !tiles[j][i + 1].wall) {
                            clydePath.add(new Node(i, j));
                        }
                    }
                }
            }

        }
        if (chase) {
            if (dist((pos.x - 8) / 16, (pos.y - 8) / 16, (pacman.pos.x - 8) / 16, (pacman.pos.y - 8) / 16) > 8){

            }
        }
    }

    //billede
    //show


    void move(){

    }

    void show(){

    }


}