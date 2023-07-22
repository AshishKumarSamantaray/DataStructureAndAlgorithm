package Assignment2HW;

public class q1 {

	public static void main(String[] args) {

	}

}
	
class Commission{
	double sales;
	Commission(double a){sales=a;}
	double getCommission()
	{if(sales<100)return 0.02*sales;
	else if(sales>=100&&sales<5000)return 0.05*sales;
	else return 0.08*sales;}
	
	}
