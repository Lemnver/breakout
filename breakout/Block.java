package breakout;
import breakout.etc.*;
public class Block extends Obstacle {
    /*  class for blocks that Ball collides with
     *
     */
    private int _lives;
    public Block(Coordinates coordinates, int height, int width, int hitpoints){
        super(coordinates, height, width);
        _lives = hitpoints;
    }
    public void collision(Rectangle opponent){
        hit();
    }
    public void hit(){
        if (_lives > 0) {
            _lives -= 1;
        }
    }
    public int getLives(){
        return _lives;
    }
}
