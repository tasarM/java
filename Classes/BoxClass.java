class Box
{
	double width, height, depth;
	
	// Display volume of a box
	void volume()
	{
		System.out.print(" Volume = ");
		System.out.println(width*height*depth);
	}
}

class BoxClass
{
	public static void main(String args[])
	{
		Box box1 = new Box();
		Box box2 = new Box();
		
		// assign values to instance variables of boxes
		box1.width = 9;
		box1.height = 8;
		box1.depth = 7;
		
		box2.width = 4;
		box2.height = 5;
		box2.depth = 6;
		
		// Display volume of boes
		box1.volume();
		box2.volume();		
	}
}





