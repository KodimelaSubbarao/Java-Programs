public class CakeMain 
{
	public static void main(String[] args) 
	{
	   // No argument constructor
        OrderedCake defaultCake = new OrderedCake();
        defaultCake.showCake();

        // Parameterized constructor without message
        OrderedCake customCake = new OrderedCake("Square", "Chocolate", 2);
        customCake.showCake();

        // Parameterized constructor with message
        OrderedCake birthdayCake = new OrderedCake("Heart", "Strawberry", 3, "Happy Birthday");
        birthdayCake.showCake();
	}
}
