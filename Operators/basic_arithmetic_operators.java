// Demonstrate the basic arithmetic operators
class basic_arithmetic_operators
{
	public static void main(String args[])
	{
		// Integer
		int a = 3 + 5;
		int b = a * 6;
		int c = b / 12;
		int d = c - (-4);
		int e = -d;
		System.out.println("a =  " + a);
		System.out.println("b =  " + b);
		System.out.println("c =  " + c);
		System.out.println("d =  " + d);
		System.out.println("e =  " + e);
		
		// Float
		double j = 3 + 6;
		double k = j * 3;
		double l = k / 5;
		double m = l - j;
		double n = -m;
		System.out.println("\nj =  " + j);
		System.out.println("k =  " + k);
		System.out.println("l =  " + l);
		System.out.println("m =  " + m);
		System.out.println("n =  " + n);
	}
}