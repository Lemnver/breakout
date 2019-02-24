package breakout.etc;
abstract public class Rectangle implements RectangleStruct {
    private Coordinates _coords;
    private int _height;
    private int _width;
    public int getWidth(){
        return _width;
    }
    public int getHeight(){
        return _height;
    }
    public Coordinates getCoords(){
        return _coords;
    }
    public int getX() {
        return this.getCoords().getX();
    }
    public int getY() {
        return this.getCoords().getY();
    }

    public void setX(int x) {
        this.getCoords().setX(x);
    }
    public void setY(int y) {
        this.getCoords().setY(y);
    }
    public Rectangle(Coordinates coordinates, int height, int width){
        _coords = coordinates;
        _height = height;
        _width = width;
    }
}
