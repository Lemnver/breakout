package breakout.etc;
public class Coordinates {
    private int _cordX;
    private int _cordY;
    public Coordinates(int x, int y){
        _cordX = x;
        _cordY = y;
    }
    public int getX(){
        return _cordX;
    }
    public int getY(){
        return _cordY;
    }
    public void setX(int x){
        _cordX = x;
    }
    public void setY(int y){
        _cordY = y;
    }
}
