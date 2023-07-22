package q1;
import java.util.Scanner;
public class q2 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight in kg:");
		int w = sc.nextInt();
		System.out.println("Enter the height in m:");
		int h = sc.nextInt();
		double bmi=w/(Math.pow(h, 2));
		if(bmi<18.5)
			System.out.println("The peson is Underweight");
		else if (bmi>=18.5&&bmi<=24.9)
			System.out.println("The person is Normal weight");
		else if(bmi>=25.0&&bmi>=29.9)
			System.out.println("The person is Overweight");
		else
			System.out.println("The person is Obesity");
	}

}
