import java.awt.Point;


public class SimpleMoveServant implements MoveableServant {
	public void move(Point newPosition, Moveable target) {
		target.setPosition(newPosition);		
	}
}
