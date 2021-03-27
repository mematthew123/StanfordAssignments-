package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	
	private static final int MAX_TERM_VALUE = 10000;

	public void run() {
		
			println("This program lists the Fibonacci sequence.");
			int t1 = 0;
			int t2 = 1;
			while (t1 <= MAX_TERM_VALUE) {
				println(t1);
				int t3 = t1 + t2;
				t1 = t2;
				t2 = t3;
			}
		}
	
	
	
	  	//* MAX_TERM_VALUE is the most the maximum the sequence should return//*
		//* Placed println (t1) above the int t3=t1+t2; in order for sequence to start with zero//*


	
{

	}
}
