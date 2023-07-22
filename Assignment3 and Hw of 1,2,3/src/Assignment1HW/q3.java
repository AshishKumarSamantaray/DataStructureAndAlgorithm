package Assignment1HW;
import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the common size:");
	int n = sc.nextInt();
	
	System.out.println("First array:");
	int a1[] = new int[n];
	for(int elements:a1) {elements=sc.nextInt();}
	
	System.out.println("Second array:");
	int a2[] = new int[n];
	for(int elements:a2) {elements=sc.nextInt();}
	
	int a3[]= new int[n];
	for(int i = 0;i<n;i++) {a3[i]=a1[i]*a2[i];}
	}

}
