class Dog
{
}
class Cat extends Dog
{
}
class Test60
{
	public static void main(String... args)
	{
		Dog d = new Dog();
		Cat c = new Cat();
		if(d.equals(c))
		{
			System.out.println("true");
		}
			else
		{
				System.out.println("false");
		}
	}
}
