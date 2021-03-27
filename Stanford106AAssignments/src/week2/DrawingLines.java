package week2;

import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class DrawingLines extends GraphicsProgram {
	    
	
	public void run() {
	       addMouseListeners();
	}
	    //* End user selecting start point for line //*
	    public void mousePressed(MouseEvent m) {
	       double x = m.getX();
	       double y = m.getY();
	       line = new GLine(x, y, x, y);
	       add(line);
	}
	    //* End user dragging and selecting line to end point//* 
	    public void mouseDragged(MouseEvent t) {
	       double x = t.getX();
	       double y = t.getY();
	       line.setEndPoint(x, y);
	}
	    //* this line creates the Gline graphic //*
	    private GLine line;
	}

