class Test101 {
	int a;
	{
		System.out.print(this.a +" ");
		this.a = 100;
	}
	Test101() {
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		new Test101();
	}
}
