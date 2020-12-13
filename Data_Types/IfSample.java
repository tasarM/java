class IfSample
{
	public static void main(String args [])
	{
		int x, y;
		
		x = 10;
		y = 30;
		
		if(x < y)
			System.out.println("x is less than y");
		
		x = x * 3;
		if(x == y)
			System.out.println("x equal to y");
		
		x = x * 3;
		if(x > y)
			System.out.println("x greater than y");
	}
}