import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;


public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Servant");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());        
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        Dimension size = new Dimension(500, 500);
        frame.setPreferredSize(size);
        frame.setSize(size);
        
        Canvas canvas = new Canvas();
        canvas.setPreferredSize(size);
        canvas.setSize(size);
        frame.add(canvas);
        
        MoveableServant simpleServant = new SimpleMoveServant();
        MoveableServant animatedServant = new AnimatedMoveServant();
        
        Moveable box = new Box();
        box.setPosition(new Point(10, 10));
        simpleServant.move(new Point(100, 100), box);
        simpleServant.paint(box, canvas.getGraphics());
        
        animatedServant.move(new Point(80, 80), box);
        animatedServant.paint(box, frame.getGraphics());
        
	}

}