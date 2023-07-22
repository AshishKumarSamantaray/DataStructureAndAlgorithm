package Assignment2HW;
import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book a[]= new Book[5];
		for(int i = 0;i<5;i++)
		{
		System.out.println("Enter the details of the book "+(i+1)+":");
		String b= sc.next();
		String c = sc.next();
		double d= sc.nextDouble();
		a[i]=new Book(b,c,d);
		}
		
		
		loop1: for(int i = 0;i<5;i++) {
			for(int j = 0;j<5;j++)
			{
				if(a[i].BPrice<a[j].BPrice)continue loop1;
			}
		System.out.println(" The book "+(i+1)+" has the highest price.");break loop1;
		}
	}

}

class Book{
	
	String BName,BEdition; double BPrice;
	
	Book(String a , String b, double c){BName=a;BEdition = b;BPrice=c;}
	
	void display() 
	{System.out.println("The name of the book is "+BName);
	System.out.println("The Edition of the book is "+BEdition);
	System.out.println("The price of the bopk is "+BPrice);
	}
}