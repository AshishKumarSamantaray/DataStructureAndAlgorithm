package Assignment1HW;

public class q1 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		if(a+b==c)System.out.println("a+b=c");
		else if(a-b==c)System.out.println("a-b=c");
		else if(a*b==c)System.out.println("ab=c");
		else System.out.println("no such possible combination");

	}

}
