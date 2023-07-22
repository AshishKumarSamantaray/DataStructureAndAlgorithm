package q1;
import java.util.Scanner;
public class q5 {
	public static int sum_of_digits(int n) {
	
	while(!(n>=0&&n<=9))
	{int sum = 0;
		while(n!=0)	{	
			int d = n%10;
			sum+=d;
			n/=10;}
		n=sum;
		}
	return n;
	}
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		System.out.println("Sum of the digits until the number is single digit is "+sum_of_digits( n));

	}

}
