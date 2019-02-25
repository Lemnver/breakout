package breakout.etc;
public interface Collideable extends RectangleStruct {
    /*  interface for colliding rectangles
     *
     */
    public boolean isCollision(Rectangle collider);
}
