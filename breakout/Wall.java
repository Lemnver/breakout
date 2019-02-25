package breakout;
import breakout.etc.*;
public class Wall extends Obstacle {
    /*  class for walls around the map
     *
     */
	public Wall(Coordinates coordinates, int height, int width){
        super(coordinates, height, width);
    }
	public void collision(Rectangle opponent){
	}
}
