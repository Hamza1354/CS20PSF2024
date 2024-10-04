package skillbuilder;
import java.text.NumberFormat;
import java.util.Scanner;

public class Gradeavg {

	public static void main(String[] args)
	{

		NumberFormat nf = NumberFormat.getPercentInstance();
		
        Scanner userInput = new Scanner(System.in);
		
        System.out.println("please import Grade for mark :  ");
		double mark  = userInput.nextInt();
		
		System.out.println("please import Grade for hamza :  ");
		double hamza  = userInput.nextInt();
		
		System.out.println("please import Grade for leo :   ");
		double leo  = userInput.nextInt();
		
		System.out.println("please import Grade for brad :  ");
		double brad  = userInput.nextInt();
		
		System.out.println("please import Grade for nick :  ");
		double nick  = userInput.nextInt();
		
		double total = 100 ;
		
		double Totalgradeavg =  (mark + hamza + leo + brad + nick)/5 ;
		
		
		
		System.out.println(" Grade for mark : " + nf.format(mark / total  )) ;
		
		System.out.println(" Grade for hamza : " + nf.format(hamza / total  )) ;

		System.out.println(" Grade for leo : " + nf.format(leo / total  )) ;
	
		System.out.println(" Grade for brad : " + nf.format(brad / total  )) ;
		
		System.out.println(" Grade for nick : " + nf.format(nick / total  )) ;
		
		System.out.println(" GradeAverage equals to : " + (Totalgradeavg)) ;
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
