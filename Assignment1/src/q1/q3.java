package q1;
import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		int num = n;
		int product = 1;
		int sum = 0;
		while (n!=0) {
			int d = n%10;
			sum+=d;
			product*=d;
			n/=10;
			
		}
		if(sum==product)
			System.out.println(num + " is a spy number.");
		else 
			System.out.println(num + " is not a spy number.");

	}

}
