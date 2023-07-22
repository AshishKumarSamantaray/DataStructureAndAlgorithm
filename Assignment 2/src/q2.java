import java.util.Scanner;
public class q2 {
	public Complex add(Complex a,Complex b) {
	int sumr=a.real+b.real;;
	int sumi=a.imag+b.imag;
	Complex sum = new Complex();
	System.out.println("The sum of the complex numbers is "+sumr+"+ i"+sumi);
	return sum;
	}
	public static void main(String[] args) {
	Complex c1=new Complex();
	System.out.println("Enter the first complex number:");
	c1.setData(0, 0);
	c1.display();
	Complex c2=new Complex();
	System.out.println("Enter the second complex number:");
	c2.setData(0, 0);
	c2.display();
	q2 q2 = new q2();
	q2.add(c1, c2);	

}}

class Complex{
int real,imag;

void setData(int a,int b) 
{Scanner sc = new Scanner(System.in);
a = sc.nextInt();b=sc.nextInt();
real=a;imag=b;}


void display() 
{System.out.println("The number is "+real+"+"+imag+"i .");}
}


	




