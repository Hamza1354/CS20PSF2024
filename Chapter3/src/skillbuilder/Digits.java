
package skillbuilder;

import java.util.Scanner;

public class Digits {
	
public static void main(String[] args) {
		
		  
		    int hundred = 0;
	
		    int ten = 0;
		    
		    int one = 0;
		    
		    int number;
		    
		
	
			Scanner userInput = new Scanner(System.in);
			
				
		      System.out.println("enter 2 digits code");

		      
		      number = userInput.nextInt();
			

		    
		       
			ten = (number - (hundred *100)) / 10;
			System.out.println(" ten  digit placement : " + ten);
			
			
			one = (number - (ten*10) - (hundred*100));
			System.out.println(" one  digit placement : " + one);
			

}
}