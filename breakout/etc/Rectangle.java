package breakout.etc;
class Rectangle implements RectangleStruct {
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
    public Rectangle(Coordinates coordinates, int height, int width){
        _coords = coordinates;
        _height = height;
        _width = width;
    }
}
