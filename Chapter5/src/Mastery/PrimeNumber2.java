package Mastery;
import java.util.Scanner;
public class PrimeNumber2 {
	public static void main(String[] args) {
		
		int num1;
		
		boolean Prime=true;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter any number:");
		
		int num=scan.nextInt();
		
	     for(int i=2;i<=num/2;i++)
		{
	   
	    	
	    	 num1=num%i;
		   if(num1==0)
		   {
			   Prime =false;
		   
		    
		  
		   }
		}
		
		
	     if(Prime)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");
	   }
	
  }