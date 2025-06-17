import java.util.*;
import jave.io.*;

public class HelloWorld{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int gcd=Math.min(a, b);
		while(gcd>0) {
			if(a%gcd==0 && b%gcd==0) {
				break;
			}
			gcd--;
		}
		System.out.println(gcd);
		
	}
}
