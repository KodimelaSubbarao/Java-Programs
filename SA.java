interface SA
{
	String myInterface(String a); //abstract method 
	int hashCode(); //Object class methods
	String toString();	
	default void nit() 
	{
		
	}
	default int newInterface(int a) 
	{
		return a;
	}
}