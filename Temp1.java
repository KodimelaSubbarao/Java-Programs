class  Temp1
{
	public void Temp1()
	{
	
	}
    public static void add(Integer...args)
    {
        int sum=0;
        String s="";
        for(int arg:args)
        {
            sum+=arg;
            s=s+arg+"+";
        }
        String ss=s.substring(0,s.lastIndexOf('+'));
        System.out.println(ss+"="+sum);
    }

	public static void main(String[] args) 
	{

		int x=10;
		int y=20;
		if(x==10)
		if(y==20)
			if(false)
				System.out.println(y);


		//add(10,20);
		//add(10,20,30);

/*
		int x=10;
		if(x==10)
		{
			int j=20;
			x=x+j;

		}
		//System.out.println(j);
*/

	/*	
		Temp1 t=new Temp1();
		System.out.println(t);
		t=new Temp1();
		System.out.println(t);
	*/
















		/*
		System.out.print("Hk,");
		System.out.println("NIT");
		System.out.print("Ameerpet,");
		System.out.println("Hyderarabad");
		System.out.println("Telangana");
		System.out.println();
		System.out.print("Hk,NIT\nAmeerpet,Hyderarabad\nTelangana\n");

		System.out.print(5+6);
		System.out.println();
		System.out.printf("%d\n",(5+6));
		System.out.println();

		if(System.out.printf("Hello\n")!=null)
		{
		}
		if(System.out.append("World\n")!=null)
		{
		}
		if(System.out.append("Kodimela Subbarao \n").equals(null))
		{
		}
		*/
	}
}
