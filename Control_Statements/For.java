// Demonstrate the for loop
class For
{
	public static void main(String args[])
	{
		int sum = 0;
		int number = 6;
		
		for(int i=1; i <= number; i++)
		{
			System.out.println("Value = " + i);
			sum += i;
		}
		System.out.println("Sum of the values is " + sum);
	}
}