package breakout.etc;
abstract class Obstacle extends Rectangle implements Collideable {

    public boolean isCollision(Rectangle collider);
}
