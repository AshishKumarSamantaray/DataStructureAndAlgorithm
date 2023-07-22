package q1;
import java.util.Scanner;
public class q6 {
public static boolean isOdd(int m) {
	if((m&1)==1)return true;
	return false;}

public static boolean isOdd2(int m) {
	while(!(m==-1||m==0)) {m-=2;}
	if(m==-1)return true;
	return false;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		System.out.println(num+" is ODD:"+isOdd(num));
		System.out.println(num+" is ODD:"+isOdd2(num));

	}

}
