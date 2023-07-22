package Assignment3and3HW;
import java.util.Scanner;
public class q1homework {

	public static void main(String[] args) 
	//any class in which we have created our own exception we have to include 
	//throws keyword
	{
		/*Create a class Bank with instance variables account_no, name, and balance of the customer.
If the input balance is less than or equal to zero then create an Exception called “Invalid
BalanceException” and throw it using Java. Display the custom message “Balance cannot be
less than 0”.*/
		Bank a = new Bank();
		a.input();
	}

}

class Bank{Scanner sc = new Scanner(System.in);
	long account_no,balance;String name;
	void input()  //unchecked exception thus throws needed as we have created if you
	//are throwing else not needed
	{	System.out.println("Enter your Account no:");
		account_no=sc.nextLong();
		System.out.println("Enter your name:");
		name=sc.next();
		System.out.println("Enter your balance");
		balance=sc.nextLong();
		if(balance<0) {InvalidBalaceEException e = new InvalidBalaceEException();
		System.out.println(e.toString());//as these methods only return string but
		// we have to print them by sysout method
		}
	}
	
}

class InvalidBalaceEException extends Exception{
	public String getMessage() {return "Balance cannot be less than 0";}
	
}