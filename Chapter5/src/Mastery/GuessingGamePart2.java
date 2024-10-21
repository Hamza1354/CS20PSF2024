package Mastery;
import java.util.Random;
import java.util.Scanner;
public class GuessingGamePart2 {
	public static void main(String[] args) {
	
				
	  
		Random random = new Random();
       int X = random.nextInt(20) + 1;
  
      
       Scanner userInput = new Scanner(System.in);
      
		System.out.println("please import a number between 1 and 20");
		
		
		
		int X1 = userInput.nextInt();
		
			
				
				  while (X1 != 0)
				  {
			         
			            if (X1 == X)
			            {
			                System.out.println("You got the number correct!");
			            } else {
			                System.out.println("You've guessed it incorrectly. Please try again.");
			            }
						
					
		
			            System.out.println("Please guess the number, hint it is between 1-30 :  ");
						
			            X1 = userInput.nextInt();
						
			         
			        }
				  System.out.println("Game Over!");
			
			    }
			}