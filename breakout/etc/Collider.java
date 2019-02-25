package breakout.etc;
public interface Collider extends RectangleStruct {
    /*  interface for colliding rectangles
     *
     */
    public boolean isCollision(Rectangle collider);
}
