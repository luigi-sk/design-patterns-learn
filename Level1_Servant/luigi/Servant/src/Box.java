import java.awt.Point;


public class Box implements Moveable{
	private Point position;

	public void setPosition(Point point) {		
		position = point;
		System.out.println("box new position x:" + point.x + ", y:" + point.y);
	}

	public Point getPosition() {		
		return position;
	}

}
