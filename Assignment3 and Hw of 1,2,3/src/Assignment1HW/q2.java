package Assignment1HW;
import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines you want to enter:");
		int n = sc.nextInt();
		System.out.println("Enter the lines:");
		String a []=new String[n];
		for(int i = 0;i<n;i++)
		{a[i]=sc.nextLine();}
		
		for(int i = n-1;i>=0;i--)
		{System.out.println(a[i]);}

	}

}
