package skillbuilder;
import java.util.Scanner;
public class Exponet {
  public static double THEPOWER(double base, double exponent) {
      return Math.pow(base, exponent);
  }
  public static void main(String[] args) {
      Scanner USERINPUT = new Scanner(System.in);
  
      System.out.print("Enter the base number: ");
      double BASE = USERINPUT.nextDouble();
     
     
     
      System.out.print("Enter the exponent: ");
      double EXPONENT = USERINPUT.nextDouble();
 
     
     
      double result = THEPOWER(BASE, EXPONENT);
 
      System.out.printf("%2f to the power of %.2f is %2f%n", BASE, EXPONENT, result);
     
  
     
  }
}
