public class Test121
{
	public static void main(String[] args){
	// Creating instance of Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.computeArea(5, 10);
        rectangle.show();

        // Creating instance of Cuboid
        Cuboid cuboid = new Cuboid();
        cuboid.computeArea(5, 10, 15);
        cuboid.show();
	}
}
class Geometricshape 
{
	protected  String shape;
	protected  double area;

	public Geometricshape(){
		this.shape="Default Shape";
		this.area=0.0;
	}
	public double computeArea(double value1, double value2)
	{
		return area;
	}
	public void show()
	{
		System.out.println("Shape : "+this.shape);
		System.out.println("Area : "+this.area);
	}
}

class Rectangle extends Geometricshape
{
	private double length;
	private double width;
	public Rectangle(){
		this.length=10;
		this.width=10;
	}
	public void setWidth(double width)
	{
		this.width=width;
	}
	public void setLength(double length)
	{
		this.length=length;
	}
	public double getWidth()
	{
		return width;
	}
	public double getLength()
	{
		return length;
	}
	public double computeArea(double width, double length)
	{
		this.length=length;
		this.width=width;
		this.area=length*width;	
		return this.area;
	}
	public void show()
	{
		System.out.println("Shape :  Rectangle");
		System.out.println("Length : "+length);
		System.out.println("Width : "+width);
		System.out.println("Area : "+area);
	}
}

class Cuboid extends Rectangle
{
	private double height;
	public Cuboid()
	{
		this.height=15;
	}
	public void setHeight(double height)
	{
		this.height=height;
	}
	public double getHeight()
	{
		return height;
	}
	public double computeArea(double width, double length, double height){
		super.computeArea(width,length);
		this.height=height;
		this.area=super.area*height;	
		return this.area;
	}
	public void show()
	{

		System.out.println("Shape : Cuboid  ");
		System.out.println("Length : "+getLength());
		System.out.println("Width : "+getWidth());
		System.out.println("Height : "+getHeight());
		
		System.out.println("Area : "+area);
	}
}
