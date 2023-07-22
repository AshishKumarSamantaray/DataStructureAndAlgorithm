package Assignment3and3HW;

public class q5homework {
public static void toh(int n,char f,char l,char m)
{if(n==0)return;
toh(n-1,f,m,l);
System.out.println("Move disk "+n+" from rod "+f+" to rod "+l);
toh(n-1,m,l,f);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		toh(n,'a','b','c');
	}

}
