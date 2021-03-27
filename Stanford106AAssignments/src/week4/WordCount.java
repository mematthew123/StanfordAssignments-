package week4;

import acm.program.ConsoleProgram;

import java.io.*;
import java.nio.file.FileSystem;
import java.util.*;
import java.util.StringTokenizer;
import javax.naming.ldap.Rdn;

public class WordCount<start> extends ConsoleProgram {

	

	public void run() {
		
		String strCurrentLine = null;
		int wordsCount = 0;
		int charCount = 0;
		int linesCount = 0;
		try (BufferedReader br = new BufferedReader(new FileReader("/Users/matthewrhoads/Desktop/Merit America/TestFile.txt"))) {
			while ((strCurrentLine = br.readLine()) != null) {
							
				
				String line = strCurrentLine;
				
	            if (line == null) break;
	            println (line);
	            linesCount++;
	            wordsCount += countWords(line);
	            charCount += line.length();
	           // linesCount += countLines();
			}
			
			
				
				
			
				
				println("Lines = " + linesCount);
				println("Words = " + wordsCount);
			    println("Chars = " + charCount);


				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace(); 
			}
	}




	private int countWords(String line) {
		StringTokenizer st = new StringTokenizer (line," ");
		int wordCount = 0;
		while (st.hasMoreTokens()){
			String word = st.nextToken();
			if (!word.equals("  "))
				wordCount++;
		} 
		return wordCount;
		
		

		

	}
}
