class A 
{
public void printName()
{
System.out.println("Name-A");
}
}
class B extends A
{
public void printName()
{
System.out.println("Name-B");
}
public void printValue() 
{
System.out.println("Value-B");
}
}
public class Test42
{
public static void main (String[] args)
{
A a = new A();
B b = (B)a;
b.printName();
}
}
