public class Test{
	int a;
	{
		System.out.print(this.a +" ");
		this.a = 100;
	}
	Test() {
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		new Test();
	}
}

/*
	int x = 100;
    
	public static void main(String[] args) 
	{
		Test t1 = new Test();		
		Test t2 = new Test();
		++t1.x; //101
		--t2.x; //99
		
		System.out.println(t1.x);
		System.out.println(t2.x);

	}
*/
