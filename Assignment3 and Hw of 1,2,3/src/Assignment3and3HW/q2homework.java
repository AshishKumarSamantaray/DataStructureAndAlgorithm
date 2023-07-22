package Assignment3and3HW;
import java.util.Scanner;
public class q2homework {
	
	public static int position(int[]a,int sindex,int eindex,int b)
	{if (eindex>=sindex)
		{
		int mid = (sindex+eindex)/2;
		if(b==a[mid])return mid;
		else if (b>a[mid])return position(a,mid+1,eindex,b);
		else return position(a,sindex,mid-1,b);
		}
	else return -1;
		}

	public static void main(String[] args) {
/*Write a recursive method in Java to search an element 
 of an array using binary search.
 */
		int a[]= {1,2,3,5,7,8,99,11,15,17,19,20};
		System.out.println(position(a,0,a.length-1,15));
		
	}

}
