package src.Mastery;
import java.util.Scanner;
public class Metric_Conversion {
  public static void main(String[] args) {
   
  	
  	
  	
   Scanner USERINPUT = new Scanner(System.in);
      int Option;
       {
    
          System.out.println("A. Inches to Centimeters");
          System.out.println("B. Feet to Centimeters");
          System.out.println("C. Yards to Meters");
          System.out.println("D. Miles to Km");
          System.out.println("E. Km to Miles");
          System.out.print("Enter your option (1-5): ");      
         
         
          Option = USERINPUT.nextInt();
          switch (Option) {
              case 1:
                  System.out.print("Please enter inches: ");
                 
                  double Inche = USERINPUT.nextDouble();
                 
                  double cent = incheToCent(Inche);
                 
                  System.out.printf("%.2f inches is %.2f centimeters.%n", Inche, cent);
                  break;
                 
                 
                 
                 
              case 2:
                  System.out.print("Please enter feet: ");
                 
                  double feet = USERINPUT.nextDouble();
                 
                  cent = feetToCent(feet);
                 
                  System.out.printf("%.2f feet is %.2f centimeters.%n", feet, cent);
                  break;
                 
                 
                 
                 
                 
              case 3:
                  System.out.print("Please enter yards: ");
                 
                  double yards = USERINPUT.nextDouble();
                 
                  double meters = yardsToM(yards);
                 
                  System.out.printf("%.2f yards is %.2f meters.%n", yards, meters);
                  break;
                 
                 
                 
                 
                 
              case 4:
                  System.out.print("Please enter miles: ");
                 
                  double miles = USERINPUT.nextDouble();
                 
                  double Km = milesToKm(miles);
                 
                  System.out.printf("%.2f miles is %.2f kilometers.%n", miles, Km);
                  break;
                 
                 
                 
                 
                 
              case 5:
                  System.out.print("Please enter kilometers: ");
                 
                  Km = USERINPUT.nextDouble();
                 
                  miles = kmToMiles(Km);
                 
                  System.out.printf("%.2f kilometers is %.2f miles.%n", Km, miles);
                  break;
                 
                 
                 
                 
         
              default:
                  System.out.println("That is not a choice. Please try again.");
                 
                 
          }
          System.out.println();
      } while (Option != 6);
  
     
     
     
  }
  public static double incheToCent(double inche) {
      return inche * 2.54;
  }
  public static double feetToCent(double feet) {
      return feet * 30.48;
  }
  public static double yardsToM(double yards) {
      return yards * 0.9144;
  }
  public static double milesToKm(double miles) {
      return miles * 1.60934;
  }
  public static double kmToMiles(double km) {
      return km / 1.60934;
  }
}
