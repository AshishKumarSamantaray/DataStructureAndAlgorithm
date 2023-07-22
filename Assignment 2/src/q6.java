import java.util.Scanner;
public class q6 {

	public static void main(String[] args) {
		
	}

}

abstract class Shape{
abstract double area();
}

class Square extends Shape{
	double s;
	void input(double a)
	{s=a;}
	double area() {
		return s*s;}
	}

class Triangle extends Shape{
	double l,b;
	void input(double a,double b)
	{l=a;
	this.b =b;}
	double area() {return l*b*0.5;}}

class Circle extends Shape{
	double r;
	void input(double a)
	{r=a;}
	double area() {
	return (4/3.0)*3.14*r*r*r;}
	}

