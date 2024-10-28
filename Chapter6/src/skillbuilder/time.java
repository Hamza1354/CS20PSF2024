package skillbuilder;
import java.util.Scanner;
public class time
{
	public static void HourtoMin()
	{
		int HOURS;
		int MINS;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of hours: ");
		
		HOURS = input.nextInt();
		
		MINS = HOURS * 60;
		
		System.out.println( "There are "+  MINS + " minutes in "+ HOURS + " hours.");		
	}
	
public static void DaytoHours()
	{
		int DAYS;
		int HOURS;
		Scanner Userinput = new Scanner(System.in);
		
		System.out.println("Enter the number of days: ");
		DAYS = Userinput.nextInt();
		HOURS = DAYS * 24;
		System.out.println( "There are "+ HOURS + " hours in "+ DAYS + " days." );			
	}
	
	public static void main(String[] args)
	{
		int option;
		Scanner Userinput = new Scanner(System.in);
				
		System.out.println( "Please pick between the two options: ");
		System.out.println( "A. Hours to minutes. ");
		System.out.println( "B. Days to hours. ");
		
		option = Userinput.nextInt();
		
		switch(option)
		{
			case 1:
				HourtoMin();
				
			case 2:
				DaytoHours();
			
		}
	}
}
