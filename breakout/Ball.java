package breakout;
import breakout.etc.*;
public class Ball extends Actor {
    
    private int _speedX;
    private int _speedY;

    public Ball(Coordinates coords, int diameter, int x_speed, int y_speed){
        super(coords, diameter, diameter);
        _speedX = x_speed;
        _speedY = y_speed;
    }
    public void leftBounce (){}
    public void rightBounce (){}
    public void topBounce (){}
    public void bottomBounce (){}


    public void collision(Rectangle opponent){
    
    }

    public boolean isCollision(Rectangle opponent){
        // kod inspirerad från föreläsning 6
        
        // check left side
        if (this.getX() == opponent.getX() ){}
        
        if (this.getX() + this.getWidth() >= opponent.getX() ||
        opponent.getX() + opponent.getWidth() >= this.getX()){
            
            if (this.getY() + this.getHeight() >= opponent.getY() ||
            opponent.getY() + opponent.getHeight() >= this.getY()){
                return true;        
            }
        }
        return false;

    }
}
