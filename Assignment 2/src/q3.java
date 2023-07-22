import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
		Student a1=new Student();
		a1.getData();
		Student a2=new Student();
		a2.getData();
		Student a3=new Student();
		a3.getData();
		Student a4=new Student();
		a4.getData();
		Student a5=new Student();
		a5.getData();
		int max = 0;
		int stu=0;
		int m[]= {a1.DSA_Marks,a2.DSA_Marks,a3.DSA_Marks,a4.DSA_Marks,a5.DSA_Marks};
	loop1:	for(int i = 0;i<5;i++) {
			for(int j = 0;j<5;j++) {
				if(i==j)continue;
				else if (m[i]<m[j])continue loop1;
				}
			max =m[i];
			stu=i;}
	
	System.out.println("The maximum marks is secured by the student "+(stu+1)+" and his/her marks is "+m[stu]+".");
		}
	

	
	

}

class Student{
	int Rollno,DSA_Marks;
	String Name;
	
	void getData()
	{Scanner sc = new Scanner(System.in);
	System.out.println("Enter your roll number:");
	Rollno=sc.nextInt();
	System.out.println("Enter your dsa marks:");
	DSA_Marks=sc.nextInt();
	System.out.println("Enter your name:");
	Name=sc.next();
	}
	
	void showData()
	{System.out.println("The roll number is "+Rollno);
	System.out.println("The DSA marks is "+DSA_Marks);
	System.out.println("The name is "+Name);
	}}
	
	
