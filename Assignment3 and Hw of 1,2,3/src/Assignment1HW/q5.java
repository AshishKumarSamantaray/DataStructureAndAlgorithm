package Assignment1HW;
import java.lang.Math;
public class q5 {

	public static void main(String[] args) {
		int a [][]=new int [4][4];
		for(int i = 0;i<4;i++)
		{
			for(int j = 0;j<4;j++)
			{
				a[i][j]=(int)(Math.random()*2);
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			}
		
		int r[]=new int[4]; int c[] = new int[4];
		
		for(int i = 0;i<4;i++)//for counting no of ones in rows
		{int temp = 0;
			for(int j = 0;j<4;j++)
		{
		 if(a[i][j]==1)++temp;
		}
		r[i]=temp;
		}
		
		for(int i = 0;i<4;i++)//for counting no of ones in columns
		{int temp = 0;
			for(int j = 0;j<4;j++)
		{
		 if(a[j][i]==1)++temp;
		}
		c[i]=temp;
		}
		
	loop1:	for(int i = 0;i<4;i++)
		{for(int j = 0;j<4;j++)
		{
			if(r[i]<r[j])continue loop1;
		}
		System.out.println("The first row with most no of ones is row "+(i+1));break loop1;
		}
	
	loop1:	for(int i = 0;i<4;i++)
	{for(int j = 0;j<4;j++)
	{
		if(c[i]<c[j])continue loop1;
	}
	System.out.println("The first column with most no of ones is row "+(i+1));break loop1;
	}

	}

}
