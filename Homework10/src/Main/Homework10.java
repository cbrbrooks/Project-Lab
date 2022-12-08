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
		
		
		EZFileRead efz = new EZFileRead("parse.txt");
		int n = efz.getNumLines();
		String r = efz.getLine(n);
		
		
		
		
		String[] movies= new String[n];
		int years[]= new int[n];
		String stars[]= new String[n];
		float runtimes[]= new float[n];
	
		
		
		for(int i=0; i<n;i++){
			String raw = efz.getLine(i);
			StringTokenizer st = new StringTokenizer(raw ,"*");
			movies[i] = st.nextToken();
			years[i] = Integer.parseInt(st.nextToken());
			stars[i] = st.nextToken();
			runtimes[i] = Float.parseFloat(st.nextToken());
		} 
	System.out.println("-----MOVIES-----");
		for(int i=0; i<n; i++){
			System.out.println(movies[i]);
		}
	System.out.println("-----YEARS-----");
		
		for(int i=0; i<n; i++){
			System.out.println(years[i]);
		}
	System.out.println("-----STARS-----");
		for(int i=0; i<n; i++){
			System.out.println(stars[i]);
	}
	System.out.println("-----RUNTIMES-----");
		for(int i=0; i<n; i++){
			System.out.println(runtimes[i]);
}
}
}	
		

