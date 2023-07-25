import java.util.Scanner;
import java.lang.Math;

public class Random
{
	public static void main(String args[])
	{
		int randomNumber = (int)(Math.random()*100)+1;
		
		int count=0, guess;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Hey!! Enter any number between 1 to 100");
			guess = sc.nextInt();
			
			 if(guess>randomNumber)
			 {
		            System.out.println("Lower number please !!\n");
		     }
		        
		     else if(guess<randomNumber)
		     {
		        	 System.out.println("Higher number please !!\n");
		     }
		        
		     else
		     {
		        	 System.out.println("Congratulations, You win !!\n");
		     }
			 count++;
		}
		
		while(guess!=randomNumber);
		System.out.println("You guessed it in "+count+" attempts");
	}
}
