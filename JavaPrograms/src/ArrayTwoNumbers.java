import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayTwoNumbers {

	public static void main(String[] args) {
		
		//Get the Array of numbers between two numbers in Java...
		// a = 1, b = 4 ==> [1,2,3,4]
		
		
		System.out.println(Arrays.toString(between(1,4)));
		

	}
	
	public static int[] between(int a, int b)
	{
		return IntStream.rangeClosed(a, b).toArray();
	}

}
