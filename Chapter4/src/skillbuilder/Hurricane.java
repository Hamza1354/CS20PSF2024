package skillbuilder;
import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Which category did the Hurricane display :   ");
		
		int category = userInput.nextInt();
		
		 int mph = 0, knots = 0, kmph = 0;

		   switch(category) {

		     case 1: mph = 74 ; knots =  64 ; kmph = 119 ;    break; 
		                 
		     case 2: mph = 96  ; knots =  83 ; kmph = 154 ; break;
		                 
		     case 3: mph = 111  ; knots =  96 ; kmph = 178 ; break;
		                 
		     case 4:  mph = 131 ; knots =  114 ; kmph = 210     ; break;
		                 
		     case 5: mph = + 155 ; knots =  + 135 ; kmph = + 249  ; break;
		     
		     default:
	                System.out.println("Invalid category entered.");  
		                 
		}   
		
		   
		   System.out.println(" here's the mph " + mph );
		   
		   
		   System.out.println(" here's the knots " + knots);
		   
		   
		   System.out.println(" here's the kmph " +  kmph);
		   
		   
		   
		
	}

}
