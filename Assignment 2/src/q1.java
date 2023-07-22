import java.util.Scanner;
public class q1 {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	phone t1=new phone();
	System.out.println("Enter the area code:");
	int a = sc.nextInt();
	System.out.println("Enter the exchange:");
	int b = sc.nextInt();
	System.out.println("Enter the number:");
	int c = sc.nextInt();
	t1.input(a,b,c);
	t1.display();
	
		
	}}
	
	class phone{
		int areacode,exchange,number;
		void input(int a,int b,int c){
			areacode=a;
			exchange=b;
			number=c;}
		
		void display() {
		System.out.println("Your phone number is ");
		System.out.println("("+areacode+")"+exchange+"-"+number);
		}

}

