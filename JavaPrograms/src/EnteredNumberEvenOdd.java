import java.util.Scanner;

public class EnteredNumberEvenOdd {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		if(num%2 ==0)
		{
			System.out.println(num + " is a Even Number");
		}
		else
		{
			System.out.println(num + " is a Odd Number");
		}

	}

}

//Check Entered Number Even or Odd using Java