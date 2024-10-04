
/*

Program: MathTutor - Mastery.java          Date: 04,10.2024

Purpose: display all the math symbol for the user to pick and compare the computer answer and user answer to see if the user is right.


School: CHHS
Course: Computer Science 20
 
*/
package Mastery;

import java.util.Scanner;
import java.util.Random;

public class Mathtutor {

    public static void main(String[] args) {
        
        Scanner winner = new Scanner(System.in);
        Random Random = new Random();
        
        int RandomNUM1 = Random.nextInt(10);  
        int RandomNUM2 = Random.nextInt(10); 
        
        
        System.out.println("choose the math symbol that your going to practice for today (+, -, *, /): ");
        
        String mathSymbol = winner.next(); 
        
        double computeranswer = 0;
        boolean CORRECTMATHSYMBOL = true;
        
        switch (mathSymbol) {
            case "+":
            	computeranswer = RandomNUM1 + RandomNUM2;
                break;
            case "-":
            	computeranswer = RandomNUM1 - RandomNUM2;
                break;
            case "*":
            	computeranswer = RandomNUM1 * RandomNUM2;
                break;
            case "/":
                if (RandomNUM2 != 0) {
                	computeranswer = RandomNUM1 / (double) RandomNUM2;  
                } else {
                    System.out.println("can't divide by zero.");
                    CORRECTMATHSYMBOL = false;  
                }
                break;
            default:
                System.out.println("Invalid Math Symbol.");
                CORRECTMATHSYMBOL = false; 
        }
        
        if (CORRECTMATHSYMBOL) {
            System.out.println("What is the answer of " + RandomNUM1 + " " + mathSymbol + " " + RandomNUM2 + "?");
            double youranswer = winner.nextDouble();
            
            if (youranswer == computeranswer) {
                System.out.println("RIGHT ANSWER " + computeranswer );
            
            } else if (youranswer == 0) {
                System.out.println("WRONG, Here's the anwser : " + computeranswer );
                System.out.println("The program will close.");
            
            } else {
            	System.out.println ("Your answer don't meet the requirments the program will close.");
                System.out.println("Wrong! The correct anwser is " + computeranswer);
            }
        }
    }
}


/* Screen Dump


Test Case 1:

Choose the math symbol that you're going to practice for today (+, -, *, /): 
/
What is the answer of 1 / 2?
0.5
RIGHT ANSWER 0.5


Test Case 2:
 
Choose the math symbol that you're going to practice for today (+, -, *, /): 
+
What is the answer of 5 + 5?
10
RIGHT ANSWER 10.0


 
 */
