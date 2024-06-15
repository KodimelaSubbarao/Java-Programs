class OutPut2
{
    public static void main(String [] args)
    {
        Count2 count = new Count2();
        count.count();
    }
}

class Count extends Count2
{
    Count()
    {

    }
}
class Count2
{
	
    void count()
    {
		 System.out.println("Output = "+ (5%7));
        int i = 5;
        System.out.print("Output = ");
	
        for (int x = 0; x <= (i % 7); x += 1)
        {
            System.out.print(" " + x);//0
        }
    }
}
