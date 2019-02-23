package breakout.etc;
abstract class Actor extends Rectangle implements Moveable, Collideable {

    public void move(Coordinates new_coords){
        _coords.setX(new_coords.getX);
        _coords.setY(new_coords.getY);
    }
    public boolean isCollision(Coordinates coord){}
}
