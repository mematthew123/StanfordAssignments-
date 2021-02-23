package week2;


import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import acm.util.*;	

public class RobotFace extends GraphicsProgram {	
	
	//Sets window size. Overrides ACM default size of 800 width, 500 height
	public static final int APPLICATION_WIDTH = 600, APPLICATION_HEIGHT = 4800; 
	
	private static final int HEAD_WIDTH = 250, HEAD_HEIGHT = 350;
	private static final int EYE_RADIUS = 27;
	private static final int MOUTH_WIDTH = 140, MOUTH_HEIGHT = 55;
	
	public void run() {
		
		double width = getWidth();	//box/window width
		double height = getHeight(); // box/window height
		
		
		
		GRect head = new GRect((width - HEAD_WIDTH) / 2, (height - HEAD_HEIGHT) / 2, HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);	
		//interior of robot face
		head.setColor(Color.BLACK);	
		//border of frame for robot
		

		
		GOval leye = makeEye(width/2 - HEAD_WIDTH/4, height/2 - HEAD_HEIGHT/4);
		GOval reye = makeEye(width/2 + HEAD_WIDTH/4, height/2 - HEAD_HEIGHT/4);		
		
		
		
		
		GRect mouth = new GRect((width - MOUTH_WIDTH) / 2, (height - MOUTH_HEIGHT) / 2 + HEAD_HEIGHT / 4, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setFillColor(Color.WHITE);
		
		GCompound face = new GCompound(); //face = all parts of head together
		
		face.add(head);
		face.add(leye);
		face.add(reye);
		face.add(mouth);
		add(face);
		
	
		}
	
	
	private GOval makeEye(double cx, double cy) {
		double x = cx - EYE_RADIUS;
		double y = cy - EYE_RADIUS;
		GOval eye = new GOval(x, y, 2 * EYE_RADIUS, 2 * EYE_RADIUS);
		eye.setFilled(true);
		eye.setColor(Color.YELLOW);
		return eye;
	}
}