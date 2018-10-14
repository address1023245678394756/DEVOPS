
import java.util.Scanner;
public class prime{

	public static void main(String args[])
	{
		int number, count =0;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		for(int i = 1; i<number/2;i++)
		{
			if(number % 1 == 0)
				count++;
		}
		if(count==2)
			System.out.println("Prime");
		else
			System.out.println("Not a prime");
	}
}
