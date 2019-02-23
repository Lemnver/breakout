package breakout;
import breakout.etc.*;
class Ball extends Rectangle implements Moveable, Collideable {

    public Ball(Coordinates coordinates, int diameter){
        super(coordinates, diameter, diameter);
    }
    public void move(Coordinates new_coords){
    }
    public boolean isCollision(Coordinates coord){
        return false;
    }
}
