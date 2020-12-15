import org.w3c.dom.*;
import processing.core.PVector;

import java.nio.file.Path;
import java.util.ArrayList;



//blå, patruljere et område, ikke heldig med at fange pacman
//2 modes
// - chase: De jagter pacman
// - scatter, de går tilbage i deres hjørne i et kort øjeblik før de igen chaser
public class Inky extends Ghost{


    PVector vel = new PVector(1,0);
    Path path;
    Tile[][] tiles;
    Node node;
    ArrayList <Node> inkyPath = new ArrayList<Node>();
    Node pathStart;
    Node pathEnd;

    public Inky(PVector pos) {
        super(pos);
        setPath();
    }

    public static PVector pos(){
        PVector pos = new PVector(8*16 +8, 1*16+8);
        return pos;
    }

    private void setPath() {
        inkyPath.clear();
        setNodes();
        pathStart = inkyPath.get(0);
        pathEnd = inkyPath.get(inkyPath.size()-1);

    }


    private void setNodes() {
        float newXpos = (pos.x-8)/16;
        float newYpos = (pos.y-8)/16;
        inkyPath.add(new Node(newXpos,newYpos));

        for (int i = 1; i < 27; i++){
            for (int j = 1; j < 30; j++){
                if (!tiles[j][i].wall){
                    //Ser om den kan komme op eller ned
                    if (!tiles[j-1][i].wall || !tiles[j+1][i].wall) {
                        //Ser om den kan komme til venstre eller højre
                        if (!tiles[j][i - 1].wall || !tiles[j][i + 1].wall) {
                            inkyPath.add(new Node(i,j));
                        }
                    }

                }
            }
        }

        if (chase == true &&  ){
        }

    }






    //billede
    //show



    void move(){

    }

    void show(){
       // img = loadImage("Inky");
        color (135,206,250);
    }


}
