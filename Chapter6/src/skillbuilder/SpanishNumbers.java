package skillbuilder;
import java.util.Scanner;
public class SpanishNumbers {
  public static void main(String[] args) {
	  
      Scanner USERINPUT = new Scanner(System.in);
    
     
     
      for (int i = 1; i <= 10; i++) {
   	  
          System.out.println(i + " - " + Spanish(i));
         
      }
     
     
     
      int userInput = USERINPUT.nextInt();
      System.out.println("The number " + userInput + " in Spanish is: " + Spanish(userInput));
    
     
     
     
  }
  public static String Spanish(int number) {
      switch (number) {
          case 1: return "Uno";
          case 2: return "Dos";
          case 3: return "Tres";
          case 4: return "Cuatro";
          case 5: return "Cinco";
          case 6: return "Seis";
          case 7: return "Siete";
          case 8: return "Ocho";
          case 9: return "Nueve";
          case 10: return "Diez";
          default: return "Número No Válido";
      }
  }
}
