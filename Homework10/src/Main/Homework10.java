// H O M E W O R K   # 1 0
// C S C   1 5
// Student's Name Here: Ruth Brooks

package Main;

import java.util.StringTokenizer;

public class Homework10{
	public static void main(String[] args){
		// My code to dynamically create a text file (DO NOT MODIFY OR REMOVE!)
		EZFileWrite efw = new EZFileWrite("parse.txt");
		efw.writeLine("Shawshank Redemption*1994*Tim Robbins*2.36");
		efw.writeLine("The Godfather*1972*Al Pacino*2.92");
		efw.writeLine("Raging Bull*1980*Robert De Niro*2.15");
		efw.writeLine("Million Dollar Baby*2004*Hilary Swank*2.2");
		efw.writeLine("Straight Outta Compton*2015*Jason Mitchell*2.45");
		efw.saveFile();
		
		// End of test
	
		// TODO: Write your code to load the text file into memory, parse it, and display the data in a meaningful way...
		// (Use the instructions in the hand out to complete the assignment for full credit)
		
		String[] movies= new String[efw.getNumLines()];
		int[] years= new int[5];
		String[] stars= new String[5];
		float[] runtimes= new float[5];

		efw.toString();
		
		
		/*for(String raw = efw.getNumLines(); raw != null; raw = raw.getNumLines()){
			String raw = File.ReadAllLines(parse.txt);
			raw = Interger.toString;
			StringTokenizer st = new StringTokenizer(raw,"*");
		} */
		
		int i=0;
		StringTokenizer st=new StringTokenizer(raw,"|");
		while (st.hasMoreTokens())
		{
		ar[i]=st.nextToken();
		i++;
		}

		
		
		
		//String[] tokens = new String[2]; //String array
		//tokens[1] = st.nextToken();
		//float movies = Float.parseFloat(tokens[1]); 
	} 
}