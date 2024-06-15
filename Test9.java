public class Test9 {
	private Test9 (int x) {   //line 1
		System.out.print(x);
	}	
	private final Test7() {    //line 2
		System.out.print(25);
	}
	public static void main(String[] args){
		Test7 t = new Test7(35);
	}
}
