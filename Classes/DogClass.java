class Dog
{
	String name;
	String color;
	int age;
}

class DogClass
{
	public static void main(String args[])
	{
		Dog mydog1 = new Dog();
		mydog1.name = "Duke";
		mydog1.color = "White";
		mydog1.age = 3;
		
		System.out.print("This is " + mydog1.name);
		System.out.print(". His color is " + mydog1.color);
		System.out.println(" and his age is " + mydog1.age);
		
		Dog mydog2 = new Dog();
		mydog2.name = "Luna";
		mydog2.color = "Black";
		mydog2.age = 1;
		
		System.out.print("\nAnd this is " + mydog2.name);
		System.out.print(". Her color is " + mydog2.color);
		System.out.println(" and her age is " + mydog2.age);
	}
}