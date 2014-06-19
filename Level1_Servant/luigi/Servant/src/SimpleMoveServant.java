import java.awt.Graphics;
import java.awt.Point;


public class SimpleMoveServant implements MoveableServant {
	public void move(Point newPosition, Moveable target) {
		target.setPosition(newPosition);		
	}

	public void paint(Moveable target, Graphics canvas) {
		Point position = target.getPosition();
		canvas.fillRect(position.x, position.y, 
				position.x + 50, position.y + 50);
	}
}
