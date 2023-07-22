package q10;
import java.util.Scanner;
public class Student {
int roll;String name;

public void input_student() 
{Scanner sc = new Scanner(System.in);
System.out.println("Enter the name and roll number:");
name=sc.next();
roll=sc.nextInt();
output();}

void output ()
{System.out.println("Name:"+name);
System.out.println("Roll number:"+roll);
}

	public static void main(String[] args) {
		

	}

	
		
	}


