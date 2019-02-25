package breakout.etc;
abstract public class Obstacle extends Rectangle implements Collideable {
    /*  abstract base class for objects that interact with others
	 *  but remain stationary
     *
     */
	public Obstacle(Coordinates coordinates, int height, int width){
		super(coordinates, height, width);
	}
    public boolean isCollision(Rectangle opponent){
        // calculates is object has collided with parameter Rectangle
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
    abstract public void collision(Rectangle opponent); 
}
