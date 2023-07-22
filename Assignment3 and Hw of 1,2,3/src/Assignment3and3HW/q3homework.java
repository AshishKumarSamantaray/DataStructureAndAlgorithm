package Assignment3and3HW;

public class q3homework {
	
public static String isPalindrome(String n)
{if(n.length()==0)return "";
else return n.charAt(n.length()-1)+isPalindrome(n.substring(0,n.length()-1));
}

public static boolean isPalindrome2(String s,int si,int ei)
{if(si==ei)return true;
else if(s.charAt(si)==s.charAt(ei)) {isPalindrome2(s,si+1,ei-1);}
else if(s.charAt(si)!=s.charAt(ei))return false;
return true;
}

	public static void main(String[] args) {
		System.out.println(isPalindrome("racecar"));
		System.out.println(isPalindrome2("ra",0,1));
	}

}
