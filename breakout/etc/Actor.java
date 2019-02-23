package breakout.etc;
class Actor extends Rectangle implements Moveable, Collideable {

    public void move(Coordinates new_coords){
    }
    public boolean isCollision(Coordinates coord){
        return false;
    }
}
