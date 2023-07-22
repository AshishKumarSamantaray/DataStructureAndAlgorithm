
public class q7 {

	public static void main(String[] args) {
		
	}

}

class Person{
	String name;
	int age;
	
	Person(String b , int c)
	{name = b;
	age = c;}
}

class Employee extends Person{
	int Eid; double salary;
	Employee(String b , int c , int d, double e){
		super(b,c);
		Eid=d;salary=e;
	}
	
	void empDisplay() { System.out.println("The name of the employee is "+name+", age being "+age+", Employee id being "+Eid+"and salary is "+salary);
}}