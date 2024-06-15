public class Test7 {
	private Test7 (int x) {   //line 1
		System.out.print(x);
	}	
	private static Test7() {    //line 2
		System.out.print(25);
	}
	public static void main(String[] args){
		Test7 t = new Test7(35);
	}
}
