// Compute distance light travels using long variables
class DT_Long
{
	public static void main(String args[])
	{
		int lightspeed;
		long days;
		long seconds;
		long distance;
		
		// Approximate speed of light in miles per second
		lightspeed = 186000;
		
		// Specify number of days here
		days = 1000;
		
		// Convert to seconds
		seconds = days *24*60*60;
		
		// Compute distance
		distance = lightspeed * seconds;
		
		System.out.print("In " + days);
		System.out.print(" days light will travel about ");
		System.out.println(distance + " miles.");
		
	}
}