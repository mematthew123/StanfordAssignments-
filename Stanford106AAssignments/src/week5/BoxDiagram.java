package week5;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JLabel;

import acm.graphics.GCompound;
import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GPoint;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acmx.export.javax.swing.JButton;
import acmx.export.javax.swing.JTextField;

public class BoxDiagram extends GraphicsProgram {
	

	
	   public void init() {
	contents = new HashMap<String,GObject>(); createController();
	addActionListeners(); addMouseListeners();
	}
	
	
	
	
	
	//control strip at the bottom of the  // 
	private void createController() {
		nameField = new JTextField(MAX_NAME); 
		nameField.addActionListener(this);
		addButton = new JButton("Add"); 
		removeButton = new JButton("Remove"); 
		clearButton = new JButton("Clear"); 
		add(new JLabel("Name"), SOUTH); 
		add(nameField, SOUTH);
		      add(addButton, SOUTH);
		      add(removeButton, SOUTH);
		      add(clearButton, SOUTH);
		}
	
	
	
	
	// box//
	private void addBox(String name) {
		GCompound box = new GCompound();
		GRect outline = new GRect(BOX_WIDTH, BOX_HEIGHT);
		GLabel label = new GLabel(name);
		box.add(outline, -BOX_WIDTH / 2, -BOX_HEIGHT / 2); box.add(label, -label.getWidth() / 2, label.getAscent() / 2); add(box, getWidth() / 2, getHeight() / 2);
		contents.put(name, box);
		}
	
	
// removes box// 	
	   private void removeBox(String name) {
	      GObject obj = contents.get(name);
	      if (obj != null) {
	         remove(obj);
	      }
	}
	
	

	   
	   // removes 
	   private void removeContents() {
	Iterator<String> iterator = contents.keySet().iterator(); while (iterator.hasNext()) {
	         removeBox(iterator.next());
	      }
	contents.clear(); // Clear all entries in the hashmap
	}

	
	
	/* Called in response to button actions */ 
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == addButton || source == nameField) {
		         addBox(nameField.getText());
		      } else if (source == removeButton) {
		         removeBox(nameField.getText());
		      } else if (source == clearButton) {
		         removeContents();
		      }
		}
	
	
	



	/* Called on mouse press to record the coordinates of the click */ 
	public void mousePressed(MouseEvent e) {
	      last = new GPoint(e.getPoint());
	      currentObject = getElementAt(last);
	   }
	
	
	
	/* Called on mouse drag to reposition the object */ 
	public void mouseDragged(MouseEvent e) {
		if (currentObject != null) { 
			currentObject.move(e.getX() - last.getX(),
		                            e.getY() - last.getY());
		         last = new GPoint(e.getPoint());
		} }

	
	/* Called on mouse click to move this object to the front */ 
	public void mouseClicked(MouseEvent e) {
		if (currentObject != null) currentObject.sendToFront(); }
	
	
	/* Private constants */
	private static final int MAX_NAME = 25; 
	private static final double BOX_WIDTH = 120; 
	private static final double BOX_HEIGHT = 50;

	
	
	/* Private instance variables */
	private HashMap<String,GObject> contents; private JTextField nameField;
	private JButton addButton;
	private JButton removeButton;
	private JButton clearButton;
	private GObject currentObject;
	private GPoint last;

}

//	public void init () {
//		contents = new Hash
//		add (new JButton("add"), SOUTH);
//		add (new JButton("remove"), SOUTH);
//		add (new JButton("clear"), SOUTH);
//		addActionListeners();
//		addMouseListeners();
//		
//	}



// End reslut of project will be an end user interactive tool  
// that displays the users inputed text inside of an unfilled box- will be moveable

/*
 * first i am going to create a blank canvas. After creating the canvas goinf to
 * add a control panel. control panel will have three buttons- add, clear,
 * remove and a Jtext place for user text to be entered. will need to establish
 * move control and mouse drag recent user text removed by remove and clear
 * removes all displayed text. The canvas will need to have the memory retetinon
 * to display mutliple user inputs simutanuisly ( however the hell you spell
 * that )
 */

/*
 * create dimensions on canvas per BOX_WIDTH=120 and BOX_Height= 50
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * JLabel , JTextField , three JButtons (add , remove , clear ) - empty graphic
 * canvas w/ control bar Java Collection Framework for structure and keeping
 * track of all boxes on screen
 * 
 * JTextField is the empty bar where the user will type info into
 * 
 * private static final double BOX_WIDTH = 120; private static final double
 * BOX_HEIGHT = 50;
 * 
 */