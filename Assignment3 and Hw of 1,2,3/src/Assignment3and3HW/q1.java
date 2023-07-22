package Assignment3and3HW;
import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = sc.nextInt();
		if(a<0)
			throw new NumberFormatException("Negative Number");
		else 
			System.out.println("Your lucky number is "+a);
	}

}
