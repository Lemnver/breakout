package breakout.etc;
abstract class Actor extends Rectangle implements Moveable, Collider {

    public void move(Coordinates new_coords){
        this.getCoords().setX(new_coords.getX());
        this.getCoords().setY(new_coords.getY());
    }
    public boolean isCollision(Rectangle opponent){
        // kod inspirerad från föreläsning 6
        if (this.getX() + this.getWidth() >= opponent.getX() ||
        opponent.getX() + opponent.getWidth() >= this.getX()){
            if (this.getY() + this.getHeight() >= opponent.getY() ||
            opponent.getY() + opponent.getHeight() >= this.getY()){
                return true;        
            }
        }
        return false;

    }
    public Actor (Coordinates coordinates, int height, int width){
        super(coordinates, height, width);
    }
}
