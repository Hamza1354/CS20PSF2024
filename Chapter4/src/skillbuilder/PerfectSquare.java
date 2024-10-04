package skillbuilder;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("please import a integer:  ");
        int rootNum = scanner.nextInt();
		
        double squareroot = Math.sqrt(rootNum);
		
        double shortenroot = (double) squareroot;
 
        
        double SquareNUM = shortenroot * shortenroot;
        
        
        
        if (SquareNUM == rootNum) {
            System.out.println(squareroot + " correct import");
            
        } else {
            System.out.println(squareroot + " Incorrect not a perfect square");
        }
        
        
	}

}
