import processing.core.PApplet;

public class GhostSpeed extends PApplet {

    private float x = 80;
    private float y = 60;
    private float speedX;
    private float speedY;

    public GhostSpeed(float Xpos, float Ypos, float Xspeed, float Yspeed) {
        x = Xpos;
        y = Ypos;
        speedX = Xspeed;
        speedY = Yspeed;
    }


    void move () {
        x = x + speedX;
        y = y + speedY;

        // SETS THE BOUNDARIES for Ghosts

        if (x > width) {
            speedX = -speedX;
        } else if (x < 1) {
            speedX = -speedX;
        } else if (y > height) {
            speedY = -speedY;
        } else if (y < 1) {
            speedY = -speedY;
        }
    }
}


        /*void move1() {
            xX = xX + speedX;
            yY = yY + speedY;

            // SETS THE BOUNDARIES for Ghosts

            if (xX > width) {
                speedX = -speedX;
            } else if (xX < 1) {
                speedX = -speedX;
            } else if (yY > height) {
                speedY = -speedY;
            } else if (yY < 1) {
                speedY = -speedY;
            }
*/

