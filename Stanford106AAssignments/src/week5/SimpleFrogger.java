package week5;



	/*
	* File: SimpleFrogger.java
	* ------------------------
	* This program solves the Frogger problem from the practice midterm. */
import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;

/*
 * This program gets a frog to jump one square in the closest * direction to a
 * mouse click.
 */
public class SimpleFrogger extends GraphicsProgram {
	public void run() {
		frog = new GImage("frog.gif");
		fx = (NCOLUMNS / 2 + 0.5) * SQUARE_SIZE;
		fy = (NROWS - 0.5) * SQUARE_SIZE;
		add(frog, fx - frog.getWidth() / 2, fy - frog.getHeight() / 2);
		addMouseListeners();
	}

	public void mouseClicked(MouseEvent e) {
		double mx = e.getX();
		double my = e.getY();
		if (Math.abs(mx - fx) > Math.abs(my - fy)) {
			if (mx > fx) {
				(SQUARE_SIZE, 0);
			} else {
				(-SQUARE_SIZE, 0);
			}

	}


	private boolean insideFroggerWorld(double x, double y) {
	      return (x >= 0 && x <= NCOLUMNS * SQUARE_SIZE &&
	              y >= 0 && y <= NROWS * SQUARE_SIZE);
	}

	/* Private constants */
	private static final int SQUARE_SIZE = 75;
	private static final int NROWS = 4;
	private static final int NCOLUMNS = 7;
	/* Private instance variables */
	private GImage frog;
	private double fx;
	private double fy;
	/* The image of the frog */
	/* The x-coordinate of the frog's center */
	/* The y-coordinate of the frog's center */
	/* Sets the graphics window size */
	public static final int APPLICATION_WIDTH = NCOLUMNS * SQUARE_SIZE;
	public static final int APPLICATION_HEIGHT = NROWS * SQUARE_SIZE;
}