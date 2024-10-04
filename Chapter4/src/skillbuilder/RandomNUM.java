package skillbuilder;
import java.util.Random;
import java.util.Scanner;

public class RandomNUM {

	public static void main(String[] args) {
		
		
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.print("Enter the MIN value: ");
		int SMALL =  userInput.nextInt();
		
		System.out.print("Enter the MAX value: ");
		int BIG =  userInput.nextInt();
		
		
		

		 if (SMALL > BIG) {
	            System.out.println("Error: min must be smaller then ");
	            return;
		
		 }
		
		 Random random = new Random(); 
		 int X = random.nextInt((BIG - SMALL) + 1) + SMALL;
		
		 System.out.println("Random number between " + SMALL + " and " + BIG + ": " + X);
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
