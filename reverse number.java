import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
		int rev = 0;
        while(n > 0){
            int temp = n % 10;
            rev = (revNum * 10) + temp;
            n = n / 10;
        }
        System.out.println(revNum);
    }
}
                            
                        