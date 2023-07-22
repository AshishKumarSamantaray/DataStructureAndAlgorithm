
public class q5 {

	public static void main(String[] args) {
		
	}

}

class Deposit{
	long Principal;
	int time;
	double rate,Total_amt;
	
	 Deposit(){}
	 Deposit(long a, int b, double c){Principal = a;time = b;rate=c;}
	 Deposit(long a, int b){Principal=a;time = b;rate=0;}
	 Deposit(long a, double b){Principal = a;rate = b;time=0;}
	 
	 void display() {System.out.println("Principal = "+Principal+"\n"+"Time=" +time+"\n Rate ="+rate+"\n Total_amt="+Total_amt);}
	 
	 void calc_amt() { Total_amt=Principal + (Principal*rate*time)/100;}

}
