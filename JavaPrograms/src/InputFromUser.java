import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		
		
		int a;
		float f;
		String s;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer: " );
		a = sc.nextInt();
		System.out.println("You Entered A Integer: " + a);
		
		System.out.println("\n" +"Enter a Float: ");
		f = sc.nextFloat();
		System.out.println("You Enter a Float: " + f);
		
		System.out.println("\n"+ "Enter a String: ");
		s = sc.next();
		System.out.println("You Entered a String : " + s);
		

	}

}
