package Class;
import Classes.Class4;
public class ClassH extends Class4
{
	public static void main(String[] args) 
	{
		Class4 obj1=new Class4(); // parent class reference say do not access protected methods
		obj1.meth1();
		ClassH obj2=new ClassH();// child class reference say access  protected methods only.
		obj2.meth1();
		Class4 obj3=new ClassH();// parent class reference say do not access protected methods
		obj3.meth1();
	}
}
