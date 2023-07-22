package Assignment2HW;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class PointType{
	Scanner sc = new Scanner(System.in);

	double xco,yco;
	
	void inputPoint() {System.out.println("Enter x coordinate:");
	xco=sc.nextDouble();
	System.out.println("Enter the y coordinate:");
	yco=sc.nextDouble();}
	
	void showPoint() {System.out.println("x coordinate = "+xco+"/n y coordinate = "+yco);}
	
	void showX() {System.out.println("x cooridnate is "+xco);}
	void showY() {System.out.println("y cooridnate is "+yco);}

}

class CircleType extends PointType{
	Scanner sc =new Scanner(System.in);
	double rad;
	
	void center() 
	{inputPoint();}
	
	void Radius() 
	{System.out.println("Enter the radius of the circle:");
	rad = sc.nextDouble();}
	
	void displayCenter()
	{System.out.println("The coordinates of the center is ("+xco+","+yco+").");}
	
	void displayRadius()
	{System.out.println("The radius of the circle is "+rad);}
	
	void displayAreaAndCircum()
	{System.out.println("The area of th circle is "+(Math.PI*rad*rad));
	System.out.println("Te circumference of the circle is "+(2*Math.PI*rad));}
	
	
}








