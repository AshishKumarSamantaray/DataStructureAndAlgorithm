package Assignment3and3HW;

public class q10 {
	public static void revString(String s)
	{System.out.print(s.length()+" ");
		if(s.length()==1)System.out.print(s);
	else {System.out.print(s.charAt(s.length()-1));revString(s.substring(0, s.length()-1));}
	}//the end index of substring is exclusive thus not included thats why
	//it everytime omits the last character of the string
	public static void main(String[] args) {
		revString("pots&pans");
		
	}

}
