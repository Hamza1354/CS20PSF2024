package src.Mastery;
import java.util.Scanner;
public class AddCoins
{
	
	
	
  public static void main(String[] args)
 
  {
      Scanner scanner = new Scanner(System.in);
     
     
      System.out.print("Enter the number of pennies: ");
      int PENNIES = scanner.nextInt();
     
     
      System.out.print("Enter the number of nickels: ");
      int NICKELS = scanner.nextInt();
     
     
    
      System.out.print("Enter the number of dimes: ");
      int DIMES = scanner.nextInt();
     
     
    
      System.out.print("Enter the number of quarters: ");
      int  QUARTERS = scanner.nextInt();
     
     
      System.out.println("Total amount: " + DOLLARamount(PENNIES, NICKELS, DIMES, QUARTERS));
     
     
     
  
  }
  public static String DOLLARamount (int PENNIES, int NICKELS, int DIMES, int QUARTERS)
 
  {
      double SUMTOTAL = PENNIES * 0.01 + NICKELS * 0.05 + DIMES * 0.10 + QUARTERS * 0.25;
     
     
      return String.format("$%.2f", SUMTOTAL);
  }
}
