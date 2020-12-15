import processing.core.PVector;

import java.nio.file.Path;
import java.util.ArrayList;

public class Pinky extends Ghost{
    PVector vel = new PVector(1,0);
    Path path;
    Tile[][] tiles;
    Node node;
    ArrayList<Node> pinkyPath = new ArrayList<Node>();
    Node pathStart;
    Node pathEnd;

    public Pinky(PVector pos) {
        super(pos);
        setPath();
    }

    public static PVector pos(){
        PVector pos = new PVector(23*16 +8, 26*16+8);
        return pos;
    }

    public void setPath(){
        pinkyPath.clear();
        setNodes();
        pathStart = pinkyPath.get(0);
        pathEnd = pinkyPath.get(pinkyPath.size()-1);
    }

    public void setNodes(){
        float newXpos = (pos.x-8)/16;
        float newYpos = (pos.y-8)/16;
        pinkyPath.add(new Node(newXpos,newYpos));

        for (int i = 1; i< 27; i++) {//check every position
            for (int j = 1; j < 30; j++) {
                if (!tiles[j][i].wall) {
                    if (!tiles[j - 1][i].wall || !tiles[j + 1][i].wall) {
                        if (!tiles[j][i - 1].wall || !tiles[j][i + 1].wall) {

                            pinkyPath.add(new Node(i, j));
                        }
                    }
                }
            }
        }

    }

}
