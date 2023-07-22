package Assignment3and3HW;
import java.util.Scanner;
public class q4 {

	 public static <E> void printArray(E[] inputArray) {
		    // display array elements
		    for (E element : inputArray)
		      System.out.printf(element+" ");

		    System.out.println();
		  }
	
	public static void main(String[] args) {
		 Integer[] integerArray = { 1, 2, 3, 4, 5, 6 }; //in generics we need to pass classes and not
		 //data type thus we mention everything here as class name example Integer instead of int
		    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
		    Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };

		    System.out.println("Array integerArray contains:");
		    printArray(integerArray); // pass an Integer array
		    System.out.println("\nArray doubleArray contains:");
		    printArray(doubleArray); // pass a Double array
		    System.out.println("\nArray characterArray contains:");
		    printArray(characterArray); // pass a Character array
	}
}
