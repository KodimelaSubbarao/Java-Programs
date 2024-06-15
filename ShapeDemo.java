public class  ShapeDemo
{
	public static Shape randshape(){
		int val=(int)(Math.random()*3);
		System.out.println(val);
		Shape s=null;
		switch(val)
		{
			case 0:
				s=new Circle();
				break;
			case 1:
				s=new Square();
				break;
			case 2:
				s=new Triangle();
				break;
			default :
					System.out.println("Invalid details...");
				break;
		}
		return s;
	}
	public static void main(String[] args) 
	{
		Shape s=ShapeDemo.randshape();
		s.draw();
		s.erase();
	}
}

class Shape  
{
	public void draw(){
		System.out.println("shape draw" );
	}
	public void erase(){
		System.out.println("Shape erase");
	}
}
class Circle  extends Shape
{
	public void draw( ){
		System.out.println("Circle draw");
	}
	public void erase(){
		System.out.println( "Circle erase");
	}
}
class Triangle   extends Shape
{
	public void draw(){
		System.out.println( "Triangle draw");
	}
	public void erase(){
		System.out.println("Triangle erase");
	}
}
class Square   extends Shape
{
	public void draw(){
		System.out.println("Square draw");
	}
	public void erase(){
		System.out.println("Square erase");
	}
}