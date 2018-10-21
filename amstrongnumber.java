package operators;
import java.util.Scanner;
public class amstrongnumber {
	public static void main(String args[])
	{
		int number, sum = 0, safe, remainder;
		System.out.println("Enter the number:");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		safe = number;
		while(safe!=0)
		{
			remainder = safe % 10;
			sum = sum + remainder * remainder * remainder;
					safe = safe / 10;
		}
		if(sum == number)
			System.out.println("It is a amstrong number");
		else
			System.out.println("It is not a amstrong number");
	}

}
