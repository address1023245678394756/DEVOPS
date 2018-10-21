package operators;
import java.util.Scanner;
public class palindrome {
	public static void main(String args[])
	{
		int number, reverse = 0, safe;
		System.out.println("Enter the number:");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		safe = number;
		while(safe!=0)
		{
			reverse = (reverse * 10);
			reverse = reverse + (safe% 10);
			safe = safe / 10;
		}
		if(number == reverse)
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not a palindrome");
	}

}
