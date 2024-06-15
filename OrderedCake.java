public class OrderedCake extends Cake 
{
	private String message;
	public OrderedCake()
	{
		super("Round","Vanilla",1);
		/*super.setShape("Round");
		super.setFlacour("Vanilla");
		super.setQty(1);*/
		super.setPrice(super.getQty()*400);
	}
	public OrderedCake(String shape,String flavour,int qty)
	{
		super(shape,flavour,qty);
		super.setPrice(super.getQty()*400);
	}
	public OrderedCake(String shape,String flavour,int qty,String message)
	{
		super(shape,flavour,qty);
		this.message=message;
		super.setPrice(super.getQty()*400);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	public void showCake()
	{
		if (message != null && !message.isEmpty())
			System.out.println("A "+super.getShape()+" "+super.getFlavour()+" Vanilla Cake Of "+super.getQty()+" Kg/Kg's  ready with message "+message+"  @ Rs."+super.getPrice()+"/-");
		else
			super.showCake();
	}
	
}
