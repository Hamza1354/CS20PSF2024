
/*

Program: Election - Mastery.java          Date: 04,10.2024

Purpose: displays quadratic equation through the formula f(x) = ax2 + bx + c


School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a Value a: ");
        double A = userInput.nextDouble();

        System.out.println("Please enter b Value b: ");
        double B = userInput.nextDouble();

        System.out.println("Please enter c Value c: ");
        double C = userInput.nextDouble();

        double ROOT1 ;
        double ROOT2 ;

        double separating = B * B - 4 * A * C;

        if (separating < 0) {
            System.out.println("The roots you have given me aren't classified as real numbers"); 
            
            System.out.println("zero real solutions ");
            
            
            
        } 
        
        if (separating == 0) {
            System.out.println("Roots are equal");
            ROOT1 = -B / (2 * A);
            ROOT2 = ROOT1;
            
            

            
            System.out.println("ROOT1 : " + ROOT1);
          
           
        } else {
        	System.out.println("Roots are different / real numbers");
            ROOT1 = ( -B + Math.sqrt (separating)) / (2 * A);
            ROOT2 = ( -B - Math.sqrt (separating)) / (2 * A);
       
            System.out.println("Heres the requested roots");
            
            System.out.println("ROOT1 : " + ROOT1);
            
            System.out.println("ROOT2 : " + ROOT2);
        }

    }
}

/*
Screen dump
test case 1
Please enter a value for a:
3
Please enter a value for b:
6
Please enter a value for c:
2
Roots are real numbers
Here is the roots
Root1: -0.42264973081037427
Root2 : -1.5773502691896255
test case 2
Please enter a value for a:
5
Please enter a value for b:
4
Please enter a value for c:
6
The roots you have entered are not real numbers
Roots are real numbers
Here is the roots
Root1: NaN
Root2 : NaN
*/

