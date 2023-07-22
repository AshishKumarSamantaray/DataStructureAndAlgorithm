package Assignment3and3HW;

public class q4homework {
public static void halfQuicksort(int []a,int b,int s,int e)
{if(s>e)return;
if(a[s]<=b) {System.out.print(a[s]+" ");halfQuicksort(a,b,s+1,e);}
else {halfQuicksort(a,b,s+1,e);System.out.print(a[s]+" ");}
	
}
	public static void main(String[] args) {
		int []a= {1,9,8,7,5,3,4,2};
		halfQuicksort(a,5,0,a.length-1);
	}

}
