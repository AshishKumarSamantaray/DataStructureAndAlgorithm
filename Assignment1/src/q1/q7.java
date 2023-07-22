package q1;
import java.util.Scanner;
public class q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int l=sc.nextInt();
		int ar[]=new int[l];
		for(int i = 0;i<l;i++)
		{ar[i]=sc.nextInt();}
		System.out.print("The given array is");
		for(int i = 0;i<ar.length;i++)
		{System.out.print(" "+ar[i]+" ");}
		System.out.println();
		
		int max = 0,min=0;
		
	loop1:	for (int i = 0;i<ar.length;i++) {
	loop2:	for (int j =0;j<ar.length;j++) {
				if(i==j)continue loop2;
				else if(ar[i]<ar[j])continue loop1;
				}
	max = ar[i]; break loop1;}
	
	loop1:	for (int i = 0;i<ar.length;i++) {
	loop2:	for (int j =0;j<ar.length;j++) {
					if(i==j)continue loop2;
					else if(ar[i]>ar[j])continue loop1;
					}
		min = ar[i]; break loop1;}
		
		
		int countmax=0,countmin=0,posmax=0,posmin=0;
		
		for(int i =0;i<ar.length;i++) {
			if(ar[i]==max)countmax++;
			if(ar[i]==min)countmin++;
		}
		
		for(int i =0;i<ar.length;i++) {
			if(ar[i]==max) {posmax=i;break;}}
		
		for(int i =ar.length-1;i>=0;i--) {
			if(ar[i]==min) {posmin=i;break;}}
		
		System.out.println("The maximum element is "+max +" and occurs "+countmax+" times.");
		System.out.println("The minimum element is "+min+" and occurs "+countmin+" times.");
		System.out.println("The first occurence of the maximum element is at position "+(posmax+1));
		System.out.println("The first occurence of the minimum element is at position "+(1+posmin));
		
		
		
		
		

	}

}
