public abstract class Cake  
{
	private String shape ; 
	private String flavour;  
	private int qty ;
	private float price ;

	protected Cake( String shape, String flavour,int qty)
	{
		this.shape=shape;
		this.flavour=flavour;
		this.qty=qty;
		this.price=qty*400;
	}

	public void setShape(String shape)
	{
		this.shape=shape;
	}

	public void setPrice(float price)
	{
		this.price=price;
	}
	public void setFlavour(String flavour)
	{
		this.flavour=flavour;
	}
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	public String getShape()
	{
		return this.shape;
	}
	public String getFlavour()
	{
		return this.flavour;
	}
	public int getQty()
	{
		return this.qty;
	}
	public float getPrice()
	{
		return this.price;
	}
	
	protected void showCake()
	{
		System.out.println("A "+this.shape+" "+this.flavour+" Vanilla Cake Of "+this.qty+" Kg/Kg's Ready @ Rs."+this.price+"/-");
	}
}
