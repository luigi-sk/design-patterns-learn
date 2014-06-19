import java.awt.Point;


public class AnimatedMoveServant implements MoveableServant {

	public void move(Point newPosition, Moveable target) {
		try{
			System.out.println("sleep 1sec");
			Thread.currentThread().sleep(1000l);
			target.setPosition(newPosition);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
