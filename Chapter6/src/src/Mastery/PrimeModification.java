package src.Mastery;
import java.util.Scanner;
public class PrimeModification {
	public static void main(String[] args) {
	
		
		
		 Scanner UserINput = new Scanner(System.in);
		
	        System.out.println("Enter any number:");
	      
	        int NUMBER = UserINput.nextInt();
	  
	      
	        if (IFPrimeNUMBER(NUMBER)) {
	            System.out.println(NUMBER + " is a Prime Number");
	           
	           
	           
	           
	        } else {
	            System.out.println(NUMBER + " is not a Prime Number");
	           
	           
	        }
	       
	       
	       
	    }
	
	    public static boolean IFPrimeNUMBER
	    (int number)
	   
	    {
	    	
	    	
	    	
	        if (number <= 1) {
	        	
	        	
	            return false;
	           
	           
	        }
	        for (int P = 2; P <= Math.sqrt(number); P++) {
	        	
	        	
	            if (number % P == 0) {
	            	
	            	
	                return false;
	               
	               
	            }
	        }
	       
	       
	       
	        return true;
	       
	       
	    }
	}