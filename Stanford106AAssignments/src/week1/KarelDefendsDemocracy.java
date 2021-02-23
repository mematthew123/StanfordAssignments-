package week1;

import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {
	public void run() {

		while (frontIsClear()) {
			move();
			if (noBeepersPresent()) {
				moveNorthCollectBeeper();
				moveSouthCollectBeeper() ;
				moveSoutheastCollectBeeper();
			}
			move();
		}

	}

	// The objective to clear the ballot was broken down into private voids after
	// establishing the recurring actions of the "while" and "if"
	// Each private void represents an "off ramp" to the beepers that need removed.
	// Hopefully this makes sense. Initially I was trying, unsuccessfully, to
	// use }else{ and construct the code as one long private void.
	private void moveNorthCollectBeeper() {
		turnLeft();
		move();
		if (beepersPresent())
			pickBeeper(); 
		
	}

	private void moveSouthCollectBeeper () {
		turnAround();
		move();
		move();
		if (beepersPresent())
			pickBeeper();
	}

	private void moveSoutheastCollectBeeper() {
		turnAround();
		if (beepersPresent())
			pickBeeper();
		move();
		turnRight();
		if (beepersPresent())
			pickBeeper();

	}
}
