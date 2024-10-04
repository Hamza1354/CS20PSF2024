

/*

Program: GuessingGamey.java          Date: 04,10.2024

Purpose: Display a guessingGame of the user to  pick out of 1 of 20 numbers 


School: CHHS
Course: Computer Science 20
 
*/


package Mastery;
import java.util.Random;
import java.util.Scanner;



public class GuessingGame {

	public static void main(String[] args) {
		
		Random random = new Random();
        int X = random.nextInt(20) + 1;
    
        
        Scanner userInput = new Scanner(System.in);
        
		System.out.println("please import a number between 1 and 20");
		 
		
		
		int X1 = userInput.nextInt();
		
		 if (X1 == X) {
			 
	            System.out.println("your guess is right, great job ");
	            
	            
	        } else if (X1 < X) {
	        	
	            System.out.println(" your guess was to low compared to the random number: " + X);
	            
	           
	        } else {
	            System.out.println("your number is too high the orginal number was: " + X );
	             
	        } 
 
		
		System.out.print(" Better luck next time");
	}

} 
	 
	 
	
	
	
	
	
	
	
	
	

