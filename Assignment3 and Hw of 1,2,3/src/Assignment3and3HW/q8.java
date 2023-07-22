package Assignment3and3HW;

public class q8 {

	public static void reverse(int n)//either take void 
	//ame karipariba (checked and works)
	{
		if(n<10)System.out.print(n);
		else {System.out.print(n%10);reverse(n/=10);}
		
	}
	
	
	public static void main(String[] args) {
		reverse(1125);
	}

}
