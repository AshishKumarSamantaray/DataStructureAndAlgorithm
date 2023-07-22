import java.util.Scanner;
public class q4 {

	public static void main(String[] args) {
	product a[]=new product[5];
	Scanner sc = new Scanner(System.in);
	int sum = 0;
	for(int i = 0;i<a.length;i++) {
	System.out.println("For product "+(i+1));
	System.out.println("Enter the product id :");
	double b = sc.nextDouble();
	System.out.println("Enter the price :");
	double c = sc.nextDouble();
	a[i] = new product(b,c);
	sum+=a[i].price;
	a[i].display();}
	product.tot_price=sum;
	System.out.println("The total price to be paid by the customer is "+product.tot_price);
	}

}
class product{
	double pid,price;
	static double tot_price;
	
	product(double a , double b){
	pid=a;
	price=b;
	}
	
	void display() {
		System.out.println("The product id of the product is "+pid+ " and the price of the product is "+price+".");
	}
}
