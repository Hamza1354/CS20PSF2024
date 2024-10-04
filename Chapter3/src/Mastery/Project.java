/*

Program: Project_Mastery.java          Date: 04,10.2024

Purpose: Display the percentage of each task 


School: CHHS
Course: Computer Science 20
*/

package Mastery;


import java.text.NumberFormat;
import java.util.Scanner; 

public class Project {

	public static void main(String[] args) {
		
		
	 NumberFormat nf = NumberFormat.getPercentInstance();	

	  Scanner userInput = new Scanner(System.in);
				
	  System.out.println("please import the time for Designing:  ");
	  double Designing  = userInput.nextInt();
	  
	
				
	  System.out.println("please import the time for Coding:  ");
	  double Coding  = userInput.nextInt();
	  
	 
				
	  System.out.println("please import the time for Debugging:  ");
	  double Debugging  = userInput.nextInt();
	  
	  
				
	  System.out.println("please import the time for Testing:  ");
	  double Testing  = userInput.nextInt();
	
		
				
	  double tasktime = Designing + Coding + Debugging + Testing ;
	  
	       
	       
				
				System.out.println("Enter the number of minutes spent on each of the following project task ");

				
				System.out.println(" Total time spent on Designing(percentage form) : " + nf.format(Designing / tasktime  )) ;
				
				System.out.println(" Total time spent on Coding(percentage form) : " + nf.format(Coding / tasktime )) ;
				
				System.out.println(" Total time spent on Debugging(percentage form) : " + nf.format(Debugging /  tasktime  )) ;
				
				System.out.println(" Total time spent on Testing(percentage form) : " + nf.format(Testing /  tasktime  )) ;
				

	}

}



/* Screen Dump


Test Case 1:
please import the time for Designing:  
23
please import the time for Coding:  
45
please import the time for Debugging:  
67
please import the time for Testing:  
45
Enter the number of minutes spent on each of the following project task 
 Total time spent on Designing(percentage form) : 13%
 Total time spent on Coding(percentage form) : 25%
 Total time spent on Debugging(percentage form) : 37%
 Total time spent on Testing(percentage form) : 25%



Test Case 2:
 please import the time for Designing:  
12
please import the time for Coding:  
45
please import the time for Debugging:  
36
please import the time for Testing:  
75
Enter the number of minutes spent on each of the following project task 
 Total time spent on Designing(percentage form) : 7%
 Total time spent on Coding(percentage form) : 27%
 Total time spent on Debugging(percentage form) : 21%
 Total time spent on Testing(percentage form) : 45%



 */
