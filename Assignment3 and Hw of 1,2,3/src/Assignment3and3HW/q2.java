package Assignment3and3HW;
import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter four colours:");
		String a [] = new String [4];
		for(int i = 0;i<4;i++)
		{a[i]=sc.next();}
		try {System.out.println("Convert string to integer");
		int b = Integer.parseInt("RED");}
		catch(NumberFormatException f) {System.out.println(f.toString());}//WE HAVE TO ADD SYSOUT
		//SO AS TO PRINT EXCEPTION AND HANDLE IT
		try {a[5]= sc.next();}
		catch(ArrayIndexOutOfBoundsException e) {System.out.println(e.toString());}
		for(int i = 0;i<4;i++)
		{System.out.println(a[i]);}
			

		
		
	}

}
