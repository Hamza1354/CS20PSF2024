package skillbuilder;

import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args)  
	{
		Scanner userInput = new Scanner(System.in);
				 
				//Declaration and initialization\
						
				System.out.print("please enter a length value: ");
				 
				int length = userInput.nextInt();
				 
				System.out.print("please enter a width value: ");
				int width = userInput.nextInt();
				
				int area = length * width ;
				
				System.out.print("The area of the rectangle is " + area );
		
	}

	 
	
}
