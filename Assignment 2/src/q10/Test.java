/*Design a package that contains two classes Student & Test. The Student class has data
members as name, roll and instance methods input ( ) & output ( ). Similarly the Test class
has data members as mark1, mark2 and instance methods input ( ), output ( ), Student is
extended by Test. Another package carry interface Sports with 2 attributes score1, score2.
Find grand total mark & score in another class.*/
package q10;
import java.util.Scanner;


public class Test{
int mark1, mark2;

public void input ()
{Scanner sc = new Scanner(System.in);
System.out.println("Enter your marks: ");
mark1=sc.nextInt();
mark2=sc.nextInt();
output();
System.out.println("The grand total marks is "+(mark1+mark2));
}

void output()
{System.out.println("The marks are: \n"+mark1+"\n"+mark2);}

	public static void main(String[] args) {
	
	}

}
