class Rectangle extends RectangleStruct {
    private Coordinates _coords;
    private int _height;
    private int _width;
    public Rectangle(Coordinates coordinates, int height, int width){
        _coords = coordinates;
        _height = height;
        _width = width;
    }
}
