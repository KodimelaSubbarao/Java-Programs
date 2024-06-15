class A
{
public void test1()
{
System.out.println("test1 A");
}
}
class B extends A
{
public void test1()
{
super.test1();
System.out.println("test1 B");
}
}
public class Test57
{
public static void main(String[] args)
{
A b = new B();
b.test1();
}
}

