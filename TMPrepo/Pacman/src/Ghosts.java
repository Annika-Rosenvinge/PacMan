import processing.core.PApplet;
import processing.core.PVector;


class Ghost extends PApplet {
    PVector pos;
    int chaseCounter = 0;
    boolean chase;
    boolean scatter;
    //int millis = millis();

    public Ghost(PVector pos) {
        this.pos = pos;


    }

    public void chasePacman(){
        chaseCounter ++;
        if (chase){
            if (chaseCounter > 0){
                chase = true;
            }
            else {
                if (chaseCounter > 3000){
                    chase = false;
                }
            }
        }
        if (chase == false){
            chaseCounter = 0;
        }

    }

}

    /*
        Blinky.move();
        Blinky.display();

        Inky.move();
        Inky.display();

        Pinky.display();
        Pinky.move();

        Clyde.display();
        Clyde.move();*/

