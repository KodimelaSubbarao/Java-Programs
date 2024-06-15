class A 
{
private void printName(){
System.out.println("Value-A");
}
}
class B extends A
{
public void printName(){
System.out.println("Name-B");
}
}
public class Test23
{
public static void main (String[] args) 
{
A b = new B();
b.printName();
}
}
