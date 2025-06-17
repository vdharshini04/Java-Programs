import java.util.*;

/* Generate a random number between 1 and 100. 
 Prompt the user to guess the number. 
 Provide feedback if the guess is too high or too low. 
 Continue until the user guesses correctly. 
 */

public class HelloWorld{
	public static void main(String[] args) {
		Random r= new Random();
		int r1=r.nextInt(100);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number to guess:");
		int n=sc.nextInt();
		
		while(n!=r1) {
			
			if(n<r1) {
				System.out.println("Your number is low");
			}
			if(n>r1) {
				System.out.println("Your number is high");
			}
			System.out.println("Enter number to guess:");
			n=sc.nextInt();
		}
		if(n==r1) {
			System.out.println("Your guess is correct!!");
		}
		System.out.println("The number is"+r1);
		
		
	}
}