import java.awt.Graphics;
import java.awt.Point;


public interface MoveableServant {
	public void move(Point newPosition, Moveable target);
	public void paint(Moveable target, Graphics canvas);
}
