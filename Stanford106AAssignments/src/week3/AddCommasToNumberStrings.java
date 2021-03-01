package week3;

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {
	
	/* On this project once intialy i was confused about the merging of concepts "string" and "numbers" However once it was brought to my attention
	that it was possible to  count within the string it became clearer */
	
				private String addCommasToNumericString(String digits) {
					String result = "";
					int len = digits.length();    // What are we measuring? A digits. How? A: the length or in this case the amount within the string thus deteringing the strings length. 
					int nDigits = 0;
					for (int i = len - 1; i >= 0; i--) {
						
						
						result = digits.charAt(i) + result;
						nDigits++;
						if (nDigits % 3 == 0 && i > 0) {   // On this line we are saying that "if" there are more than 3 zeros apply
						result = "," + result;     // this line is where  
		      }
		}
		   return result;
		}
	
	public void run() {

		
		
	}
	
}
