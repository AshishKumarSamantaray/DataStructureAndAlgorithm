package Assignment3and3HW;

public class q7 {
	
 public static int fact(int n)//using recursion
 {
	 if(n==0||n==1)
		 return 1;
	 else 
	 return n*fact(n-1);
	 
 }
 
 public static int power(int x, int n)
 {
	 if(n==0)return 1;
	 else return x*power(x,n-1);
 }
 
 public static int GCD(int a,int b)
 {
	 if(a%b==0)//continues unless a%b = 0 which means a divisible by b thus b is hcf
		 return b;
	 else 
	 {int temp = a%b;//goes here gets euclid division algo and finally returns gcd
	 a=b;b=temp;return GCD(a,b);
	 }
 }
 
 
 public static String binary(long n)//imp :- good going brother
 { long temp=n%2;
 {if (n ==1)
 return "1";
 if(n==0)return "0";
 else {return ""+binary(n/=2)+temp;}}}
 
 public static int binary2(int n)// see again
 {
	if(n==0)return 0;
	else if (n==1)return 1;
	else return (n%2)+(10*binary2(n/=2));
 }
 
 public static int prod(int a , int b)
 {
	 if(b==0)return 0;
	 else return a+prod(a,b-1);
 }
 
	public static void main(String[] args) {
		
		System.out.println(fact(4));
		System.out.println(power(2,4));
		System.out.println(GCD(14,7));
		System.out.println(binary(5));
		System.out.println(prod(3,2));
		System.out.println(binary2(5));
	}

}
