package Assignment3and3HW;

public class q5 {
	
	public static <T> int count (T[]array,T item)
	{int c = 0;
	for(int i = 0;i<array.length;i++)
	{
		if(array[i]==item)c++;
	}
	return c;
	}
	
	
	public static void main(String[] args) {
		 Integer[] integerArray = { 1, 2, 3, 4, 5, 4,4,4,4,4,4}; 
		 System.out.println(count(integerArray,4));
	}

}
