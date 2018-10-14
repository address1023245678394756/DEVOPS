
import java.util.Scanner;
public class factorial{

	public static void main(String args[])
	{
		int number, fact = 1;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		for(int i = 1; i <= number;i++)
		{
			fact = fact * i;
		
		}
		System.out.println(fact);
	}
}

