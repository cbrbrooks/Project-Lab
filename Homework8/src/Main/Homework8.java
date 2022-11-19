/* H O M E W O R K   # 8
 * C S C   1 5
 * 
 * Student's Name Here: Ruth Brooks
 * 
 * Follow the directions on the Homework #8 hand out and submit this file via Canvas by the due date.
 * 
 * */

package Main;

public class Homework8{
	public static void main(String[] args){
		// TODO: Follow Homework #8 instructions for assignment and place code below...
		// Feel free to use the p() method to print text instead of System.out.println()
		
		// TODO: Write file data...
		//public EZFileWrite(String);
		EZFileWrite ezw = new EZFileWrite("testwrite.txt");
		
		int n = 5;
			
		for (int i=1; i <=n; i++){
			ezw.writeLine("Test Line #"+i);
		}
		ezw.saveFile();
		
		
		EZFileRead ezr = new EZFileRead("testwrite.txt");
		
		
		for (int i=0; i <n; i++){
			System.out.println(ezr.getLine(i));
		}
		
		EZFileWrite eza = new EZFileWrite("testwrite2.txt");
		for (int i = 0; i <= n; i++){
			eza.writeLine(ezr.getLine(i));
			eza.saveFile();
		}
		int b = 3;
		for (int i=1; i <=b; i++){
			eza.writeLine("Append Line #"+b);
		}
		
		eza.saveFile();
		
		EZFileRead ezr2 = new EZFileRead("testwrite2.txt");
		for(int i=1; i <=n; i++){
			System.out.println(ezr.getLine(i));
		}
		// TODO: Read file data in and display...
		
		
		// TODO: Append to a file...
		
		
		// TODO: Display results of new file
		
	}
	
	public static void p(String out){
		System.out.println(out);
	}
}