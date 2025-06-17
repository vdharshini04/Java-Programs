
/* Type casting
 * manual(narrow) & automatic(wide)
 * byte -> short -> char -> int -> long -> float -> double
 */

public class HelloWorld{
	public static void main(String[] args) {
		int n=40;
		//automatic casting
		double x= n;
		System.out.println(n); //o/p: 40
	
		System.out.println(x);// o/p: 40.0
		
		//manual casting
		float y= (float) x;
		System.out.println(y);// o/p: 40.0	
		
	}
}