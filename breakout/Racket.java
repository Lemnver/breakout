package breakout;
import breakout.etc.*;
public class Racket extends Actor {
    private int _speedX;
    private int l_bound;
    private int u_bound;

    public Racket(Coordinates coordinates, int height, int width, int x_speed, int low_bound, int upp_bound){
        super(coordinates, height, width);
        _speedX = x_speed;
        l_bound = low_bound;
        u_bound = upp_bound;
    }

    public void collision(Rectangle opponent){
    }
    public void moveLeft(){
        if (this.getX() <= this.l_bound && this.getX() + this.getWidth() <= this.u_bound){
            this.setX(this._speedX + -1*this._speedX);
            }
    }
    public void moveRight(){
        if (this.getX() <= this.l_bound && this.getX() + this.getWidth() <= this.u_bound){
            this.setX(this._speedX + this._speedX);
        }
    }
}
