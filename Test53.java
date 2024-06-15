class A
{
static String str = "";
protected A()
{
System.out.println(str + "A");
}
}
class B extends A
{
private B ()
{
System.out.println(str + "B");
}
}
public class Test53 extends A
{
private Test53()
{
System.out.println(str + "Test");
}
public static void main (String[] args)
{
new Test53();
System.out.println(str);
}
}
