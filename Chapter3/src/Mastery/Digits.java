/*

Program: Digits_Mastery.java          Date: 04,10.2024

Purpose: Displays the hundred-place, tens-place, and ones-place digits for a three-digit number.


School: CHHS
Course: Computer Science 20
 
*/


package Mastery;

import java.util.Scanner;

public class Digits {
	
public static void main(String[] args) {
		
		 int  hundred = 0;   
		       
		    int ten = 0;
		    
		    int one = 0;
		    
		    int number;
		    
		
	
			Scanner userInput = new Scanner(System.in);
			
				
		      System.out.println("enter 3 digits code");

		      
		      number = userInput.nextInt();
			

		   
		    
		       
			hundred = number / 100;
			System.out.println(" hundred  digit placement :  " + hundred);
		    
		       
			ten = (number - (hundred *100)) / 10;
			System.out.println(" ten  digit placement : " + ten);
			
			
			one = (number - (ten*10) - (hundred*100));
			System.out.println(" one  digit placement : " + one);
			

}
}


/* Screen Dump
 

Test Case 1:

enter 3 digits code
318
 hundred  digit placement :  3
 ten  digit placement : 1
 one  digit placement : 8


Test Case 2:
 
enter 3 digits code
222
 hundred  digit placement :  2
 ten  digit placement : 2
 one  digit placement : 2


 
 */