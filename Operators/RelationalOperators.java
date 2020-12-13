// Demonstrate the Relational Operators
class RelationalOperators
{
	public static void main(String args[]) 
	{
		int a = 5;
		int b = 3;
		boolean c1, c2, c3, c4, c5, c6;
		c1 = (a == b);
		c2 = a != b;
		c3 = a > b;
		c4 = a < b;
		c5 = a >= b;
		c6 = a <= b;
		System.out.print(" a = " + a);
		System.out.println(" and b = " + b);
		System.out.println("\n a == b = " + c1);
		System.out.println(" a != b = " + c2);
		System.out.println(" a > b = " + c3);
		System.out.println(" a < b = " + c4);
		System.out.println(" a >= b = " + c5);
		System.out.println(" a <= b = " + c6);
	}
}