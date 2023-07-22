package q1;
import java.util.Scanner;
public class q9 {
public static double sumMajorDiagonal(double[][]a) {
	double sum = 0;
	for(int i =0; i<4;i++) {
		for (int j = 0 ;j<4;j++) {
			if(i==j)sum+=a[i][j];
		}
	}return sum;
}

	public static void main (String args[]) {
		System.out.println("Enter the elements:");
	Scanner sc = new Scanner (System.in);
	double a [][]=new double[4][4];
	for(int i =0; i<4;i++) {
		for (int j = 0 ;j<4;j++) {
			a[i][j]=sc.nextDouble();
		}
	}
	for(int i =0; i<4;i++) {
		for (int j = 0 ;j<4;j++) {
			System.out.print(a[i][j]+" ");
		}System.out.println();
	}
	System.out.println("The sumo of the elements in the main diagonal is "+sumMajorDiagonal(a));
	
	

	}

}
