/* H O M E W O R K   # 7
 * C S C   1 5
 * 
 * Student's Name Here: Ruth Brooks 
 * 
 * Follow the directions on the Homework #7 hand out and submit this file via Canvas by the due date.
 * 
 * */

package Main;

/* Create a class that handles keeping track of a video game's score (according to specifications on the hand out)
 * 
 * Fill in the fields, constructor body, and method bodies to complete the assignment. */

public class Gamescore{
	// TODO: Fields...
			private int score;
	// TODO: Constructor...
			public Gamescore(int startScore){
				this.score = startScore;
				}
	// TODO: Methods...
			public int getScore(){
				 return score;
			}
			
			public void increaseScore(int amt){
				score += amt;
			}
			
			public void decreaseScore(int amt){
				score -= amt;
			}  
			
			public void resetScore(){
				score = 0;
			}    
			
			public void setScore(int value){
				score = value;
			}
			
			public String toString(){
				return ("Score: " + score);
			}  
	}
	
	

		
	
	
	
	
	
