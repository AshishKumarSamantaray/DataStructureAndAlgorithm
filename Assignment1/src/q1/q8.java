package q1;
import java.util.Scanner;
public class q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int r=sc.nextInt();
		System.out.println("Enter the number of columns:");
		int c=sc.nextInt();
		int ar[][]=new int[r][c];
		System.out.println("Enter the elements of 2-D array:");
		int sum = 0;
		for(int l=0;l<r;l++){
			for(int i =0;i<c;i++){
				ar[l][i]=sc.nextInt();sum+=ar[l][i];}
		}
		
		System.out.println("The elements of 2-D array are ");
		for(int l=0;l<r;l++){
			for(int i =0;i<c;i++){
				System.out.print(ar[l][i]+" ");}System.out.println();}
		
		System.out.println("The sum of all the elements of 2-D array is "+sum);
		
	}

}
