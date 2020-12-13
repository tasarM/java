// Demonstrate casts
class DT_Conversion 
{
	public static void main(String args[]) 
	{
		byte b;
		int i = 257;
		double d = 323.142;
		
		System.out.println("\nConversion of int to byte.");
		// If the integer’s value is larger than the range of a
		// byte, it will be reduced modulo (the remainder of an integer
		// division by the) byte’s range.
		b = (byte) i;
		System.out.println("i and b " + i + " " + b);
		
		System.out.println("\nConversion of double to int.");
		i = (int) d;
		System.out.println("d and i " + d + " " + i);
		
		System.out.println("\nConversion of double to byte.");
		b = (byte) d;
		System.out.println("d and b " + d + " " + b);
	}
}
