package q1;
public class Q1 {

	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		int count = 0;
		while(a>2) {
			a/=2;
			int b =(int)a;
			a=b;
			count++;
		}
		System.out.println(count);

	}

}
