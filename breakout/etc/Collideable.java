package breakout.etc;
public interface Collideable extends RectangleStruct {
    public boolean isCollision(Rectangle collider);
    public void collide();
}
