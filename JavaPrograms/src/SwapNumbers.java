import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		//Swap two Numbers by using java methods
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values For A & B: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("** Before Swapping Values of A & B **\n"+ "A:" +a+"," +"B:" +b);
		
		/* 1. using third variable
		int t = a;
		a = b;
		b = t; */
		
		//using operator + and -
		a = a + b;
		b = a - b;
		a = a - b; 
		
		System.out.println("** After Swapping Values of A & B **\n" + "A:" +a + "," + "B: " +b);
	}

}
