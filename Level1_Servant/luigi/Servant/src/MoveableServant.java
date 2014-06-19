import java.awt.Canvas;
import java.awt.Point;


public interface MoveableServant {
	public void move(Point newPosition, Moveable target);
	public void paint(Moveable target, Canvas canvas);
}
