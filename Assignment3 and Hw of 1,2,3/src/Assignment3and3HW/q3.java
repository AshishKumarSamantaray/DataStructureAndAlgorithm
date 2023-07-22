package Assignment3and3HW;
import java.util.Scanner;
public class q3 {

	public static void main(String[] args) throws MarksOutOfBoundException {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name:");
	String a = sc.next();
	System.out.println("Enter the marks:");
	int b = sc.nextInt();
	if(b>100)throw new MarksOutOfBoundException();//since unhandled excception type we need to
	//also use throws
	else System.out.println(a+" has got "+b+"marks");
	}

}

class MarksOutOfBoundException extends Exception
//make it public when you are creating this outside this class so as to make it accessible
//to each and every other case in same package
{ public String getMessage() {return "Marks cant be greater than 100";}
	
	MarksOutOfBoundException(){System.out.println(toString());}}