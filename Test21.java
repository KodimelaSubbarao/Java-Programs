class Animal
{
public void eat()
{
System.out.println("Animal eating ");
}
}


class Horse extends Animal
{
public void eat() 
{
System.out.println("Horse eating");
}

public void eat(String s) 
{
System.out.println("Horse eating "+s);
}
}
public class Test21
{
public static void main(String [] args) 
{
Animal a = new Horse();
a.eat(); 
a.eat("Grass");
}
}

