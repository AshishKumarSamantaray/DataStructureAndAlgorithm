package Assignment3and3HW;

public class q9 {
	public static int fibo(int n)// previous two numbers added
	{
	if(n==0||n==1)return 1;
	else return fibo(n-2)+fibo(n-1);
	}
	public static void main(String[] args) {
		
		System.out.println(fibo(6));
	}

}
