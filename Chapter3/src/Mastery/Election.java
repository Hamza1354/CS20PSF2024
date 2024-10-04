/*

Program: Election - Mastery.java          Date: 04,10.2024

Purpose: display the number of votes for both party as well  the overall percentage of votes for both sides.


School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.text.NumberFormat;
import java.util.Scanner;

public class Election {

	private static final int Awbrey = 0;
	private static final int Martinez = 0;

	public static void main(String[] args) 
	 
	{
		NumberFormat nf = NumberFormat.getPercentInstance();
		
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.println("please import the election numbers for New york for Awbrey:  ");
		int newyork1  = userInput.nextInt();
		
		System.out.println("please import the election numbers for New york for martinez:  ");
		int newyork2  = userInput.nextInt();
		
		
		System.out.println("please import the election numbers for New jersey  for Awbrey:  ");
		int newJersey1  = userInput.nextInt();
		
		System.out.println("please import the election numbers for New jersey  for martinez:  ");
		int newJersey2  = userInput.nextInt();
		
		System.out.println("please import the election numbers for connecticut  for Awbrey:  ");
		int connecticut1  = userInput.nextInt();
		
		System.out.println("please import the election numbers for connecticut for martinez:  ");
		int connecticut2  = userInput.nextInt();
		
		
		int Awbrey1  = newyork1 + newJersey1 + connecticut1 ;
		
		int Awbrey3  = newyork1 + newJersey1 + connecticut1 ;
		
		int Martinez2  = newyork2 + newJersey2 + connecticut2 ; 
		
		int Martinez4  = newyork2 + newJersey2 + connecticut2 ; 
		
		double total = Awbrey1 + Martinez2;
		
		

		System.out.println(" Total votes for Awbrey  Total votes for Awbrey Percentage form : " + nf.format(Awbrey1 / total  )) ;
		
		System.out.println(" Total votes for Awbrey  : " + (Awbrey3)) ;
		
		System.out.println(" Total votes for Martinez Percentage form  : " + nf.format( Martinez2 / total  ));
		
		System.out.println(" Total votes for Martinez: " + ( Martinez4));
		
		System.out.println("Total votes : " + (total));
		
		
		
		
	
	}
}
	
/* Screen Dump


Test Case 1:
please import the election numbers for New york for Awbrey:  
111
please import the election numbers for New york for martinez:  
222
please import the election numbers for New jersey  for Awbrey:  
333
please import the election numbers for New jersey  for martinez:  
444
please import the election numbers for connecticut  for Awbrey:  
555
please import the election numbers for connecticut for martinez:  
666
 Total votes for Awbrey  Total votes for Awbrey Percentage form : 43%
 Total votes for Awbrey  : 999
 Total votes for Martinez Percentage form  : 57%
 Total votes for Martinez: 1332
Total votes : 2331.0



Test Case 2:
please import the election numbers for New york for Awbrey:  
333
please import the election numbers for New york for martinez:  
567
please import the election numbers for New jersey  for Awbrey:  
345
please import the election numbers for New jersey  for martinez:  
653
please import the election numbers for connecticut  for Awbrey:  
456
please import the election numbers for connecticut for martinez:  
754
 Total votes for Awbrey  Total votes for Awbrey Percentage form : 36%
 Total votes for Awbrey  : 1134
 Total votes for Martinez Percentage form  : 64%
 Total votes for Martinez: 1974
Total votes : 3108.0



 */

	
	
	
	

