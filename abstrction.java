package Interfaces;

public class abstrction extends Realme
{
	public static void main(String[] args) 
	{
		Mobile obj=new Realme();
		obj.ram();
		obj.storage();
		obj.price();
		obj.features();
		obj.model();
		((Realme) obj).stock();
		((AbstractClass) obj).ac();
		Mobile.capture();
	
		
	}
}
