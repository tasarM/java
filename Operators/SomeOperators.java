// Demonstrate several assignment  and Increment and Decrement operators.
class SomeOperators
{
	public static void main(String args[])
	{
		int a = 1;
		int b = 2;
		int c = 3;
		
		a += 3;
		b *= 3;
		c += a * b;
		c %= 4;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		int m, n;
		// Increment a = a+1 or a += 1 or a++ or ++and
		// Decrement is similar to the Increment
		m = ++b;
		n = a++;
		m++;
		System.out.println("\n\na = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("m = " + m);
		System.out.println("n = " + n);		
	}
}