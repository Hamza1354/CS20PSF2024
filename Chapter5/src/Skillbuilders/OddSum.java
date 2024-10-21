package Skillbuilders;
import java.util.Scanner;
public class OddSum {
	public static void main(String[] args) {
		
      int MAX, MIN;
		
		Scanner NUMBER = new Scanner(System.in);
		
	
		System.out.println("Enter a minimum number: ");
		MIN = NUMBER.nextInt();
		
		System.out.println("Enter a maximum number: ");
		MAX = NUMBER.nextInt();
		
	
		System.out.println("Odd numbers: ");
		
		 int x;
	      for(x=MIN;x<=MAX;x++)
	      {
	    	  if(x % 2==1)
	    	  {
	    		  System.out.println(x);
	    	  }
	      }
	    }
}
