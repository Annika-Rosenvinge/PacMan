import processing.core.PVector;
//følger efter pacman
//2 modes
// - chase: De jagter pacman
// - scatter, de går tilbage i deres hjørne i et kort øjeblik før de igen chaser
public class Blinky extends Ghost {
    public Blinky(PVector pos) {
        super(pos);
    }

    public static PVector pos(){
        PVector pos = new PVector(13*16 +8, 11*16+8);
        return pos;
    }


    //billede
    //show


    void move(){

    }

    void show(){

    }


}