public class factorialrange{

	public static void main(String args[])
	{
		for(int range = 1; range <= 5; range ++)
			{
			int fact = 1;
			for(int i = 1; i <=range;i++)
				{
					fact = fact * i;
				}
			System.out.println(fact);
			}
	}
}

