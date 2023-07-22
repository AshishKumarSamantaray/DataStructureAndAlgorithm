package q1;

import java.util.Scanner;

public class Q10 {
	public static double sumColumn(double [][]m,int c) {
		double sum =0;
		for(int i =0;i<3;i++) {
			for(int j =0;j<4;j++) {
				if(j==c)sum+=m[i][j];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3X4 matrix row by row:");
		double ar[][]=new double[3][4];

		
		for(int l=0;l<3;l++){
			for(int i =0;i<4;i++){
				ar[l][i]=sc.nextDouble();
				}}
		
		System.out.println("The elements of 3X4 matrix are ");
		for(int l=0;l<3;l++){
			for(int i =0;i<4;i++){
				System.out.print(ar[l][i]+" ");}System.out.println();}
		
		for(int i = 0;i<4;i++) {
			System.out.println("The sum of elements of column "+i+" is "+sumColumn(ar,i));
		}
		
	}
		}


