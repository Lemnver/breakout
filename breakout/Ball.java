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
    public void leftBounce (){
        flipHorizontalSpeed();
    }
    public void rightBounce (){
        flipHorizontalSpeed();
    }
    public void topBounce (){
        flipVerticalSpeed();    
    }
    public void bottomBounce (){
        flipVerticalSpeed();
    }

    private void flipVerticalSpeed(){
        _speedY = -1 * _speedY;
    }

    private void flipHorizontalSpeed(){
        _speedX = -1 * _speedX;
    }


    public void collision(Rectangle opponent){
        // left side
        if (this.getX() == opponent.getX()) {
            if (this.getY() + this.getHeight() >= opponent.getY() ||
            opponent.getY() + opponent.getHeight() >= this.getY()){
                leftBounce();
            }
        }
        // right side
        else if (this.getX() + this.getWidth() == opponent.getX()) {
            if (this.getY() + this.getHeight() >= opponent.getY() ||
            opponent.getY() + opponent.getHeight() >= this.getY()){
                rightBounce();
            }
        }
        // top
        else if (this.getY() == opponent.getY() + opponent.getHeight()){
            if (this.getX() + this.getWidth() >= opponent.getX() ||
            opponent.getX() + opponent.getWidth() >= this.getX()){
                topBounce();
            }
        }
        // bottom
        else if (this.getY() + this.getHeight() == opponent.getY()){
            if (this.getX() + this.getWidth() >= opponent.getX() ||
            opponent.getX() + opponent.getWidth() >= this.getX()){
                bottomBounce();
            }
        }
        
    }

}
