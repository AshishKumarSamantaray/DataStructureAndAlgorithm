
public class q8 {
	public static void main(String[] args) {
		
	}

}

interface DetailInfo{
	 void display(); int count(String str);
}

class PERSON{
	static int maxcount;String name;
	int count(String str) {String str1=str.trim();
	maxcount= str1.length(); return maxcount;}
void display() {System.out.println("The name is "+name+" and the number of characters in the name is "+count(name));
}}