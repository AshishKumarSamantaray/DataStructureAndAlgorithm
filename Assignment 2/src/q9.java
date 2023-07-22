import java.util.Scanner;
public class q9 {

	public static void main(String[] args) {
		
	}

}

class STUDENT{
	int roll_number;String name,course;
	
	void input_Student () 
	{Scanner sc = new Scanner(System.in);
	roll_number=sc.nextInt();
	name=sc.next();
	course=sc.next();
	}
	
	void display_Student () 
	{System.out.println("The roll number of the student is "+roll_number+
	" and the name of the student is "+name+" and the course opted by the student is "+course+".");	
	}
	
}

class Exam extends STUDENT{
	int mark1,mark2,mark3;
	void input_Marks () 
	{Scanner sc = new Scanner(System.in);
	System.out.println("Enter the marks: ");
	mark1=sc.nextInt();
	mark2=sc.nextInt();
	mark3=sc.nextInt();
	}
	
	void display_result () 
	{System.out.println("Marks obtained :"+mark1+"\n"+mark2+"\n"+mark3);}
	
}