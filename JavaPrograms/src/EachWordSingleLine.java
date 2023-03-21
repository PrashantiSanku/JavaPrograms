import java.util.Scanner;

public class EachWordSingleLine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Name: ");
		String s = sc.nextLine();
		
		for(int i = 0; i< s.length(); i++)
		{
			char ch = s.charAt(i);
			if(Character.isLetter(ch))
			{
				System.out.println(ch);
				
			}
			else
			{
				System.out.println(ch);
			}
		}
	}

}



//write each word in single line in java