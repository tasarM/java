// Demonstrate the for-each loop
class ForEach
{
	public static void main(String args[])
	{
		int sum = 0;
		int numbers[] = { 2, 3, 5, 7, 11, 13};
		
		for(int i : numbers)
		{
			System.out.println("Value = " + i);
			sum += i;
		}
		System.out.println("Sum of the values is " + sum);
	}
}