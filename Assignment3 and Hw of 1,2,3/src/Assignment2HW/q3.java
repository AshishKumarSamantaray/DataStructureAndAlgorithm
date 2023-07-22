package Assignment2HW;

public class q3 {

	public static void main(String[] args) {
		
	}

}
class Distance{
	int metres,centimetres;
	Distance(int a,int b)
	{if (b>100)
	{a+=(b/100);
	b%=100;
	metres = a;centimetres=b;
	}
	else {metres = a;centimetres=b;}
	}
	
	void display() {System.out.println
	("The distance is "+metres+"metres and "+ centimetres+" centimetres.");}
	
	Distance sum(Distance a,Distance b) 
	{int c=a.metres+b.metres;
	int d = a.centimetres+b.centimetres;
	Distance e = new Distance(c,d);
	return e;
	}
}