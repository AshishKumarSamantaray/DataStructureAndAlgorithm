package q10executes;
import java.util.Scanner;
import q10.*;
import q10interface.Sports;
public class q10 implements Sports {
		

	public void sum_score() 
	//we need to keep the visibility same or increase we cant decrease it(access modifier
	{System.out.println("The grand total score is "+(Sports.score1+Sports.score2));}
	
	void input()
	{Student s = new Student();
	s.input_student();
	Test t=new Test();
	t.input();
	sum_score();
	}
	
	public static void main(String[] args) {
		q10 hell = new q10();
		hell.input();
		}


	
	}


