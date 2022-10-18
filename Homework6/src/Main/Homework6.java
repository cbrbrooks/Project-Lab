 // C S C   1 5
 // Student's  Here: Ruth Brooks

package Main;
 
public class Homework6{
	public static void main(String[] args){
		  Arithmetic ar;
		  ar = new Arithmetic(100,5);
		  System.out.println(ar.toString());
		  System.out.println(ar.add());
		  System.out.println(ar.subtract());
		  System.out.println(ar.multiply());
		  System.out.println(ar.divide());
		  System.out.println(ar.modulo());
		  ar.changeValues(5,6);
		  System.out.println(ar.toString());
		  System.out.println(ar.add());
		  System.out.println(ar.subtract());
		  System.out.println(ar.multiply());
		  System.out.println(ar.divide());
		  System.out.println(ar.modulo());
		  System.out.println(Arithmetic.staticAdd(12,67));
	}
	
	
}