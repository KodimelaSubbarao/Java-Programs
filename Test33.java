class A1 
{
public void printName()
{
System.out.println("Value-A");
}
}
class B1 extends A1
{
protected void printName()
{
System.out.println("Name-B");
}
}
public class Test33
{
public static void main (String[] args)
{
A1 b = new B1();
newPrint(b);
}
public static void newPrint(A1 a)
{
a.printName();
}
}
