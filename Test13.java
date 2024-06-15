class Product {
	int x;
	int y;
	public Product(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public void call() {
		System.out.println("call method called");
	}

/*	public int num;
	public void call(Product ref) {
		ref.num++;
	}
*/
}
public class Test13 {
	public static void main (String[] args) {
	
	Product p = new Product();
		p.call();


	/*
		Product p = new Product();
		p.num = 1;
		p.call(p);
		System.out.println(p.num);
	*/
	}
}
