class Animal {
 String name = "Rocky ";
 String makeNoise() 
	 {
	 return "generic noise"; 
	 }
 }
 class Tiger extends Animal {
String name = "stripes ";
 String makeNoise() 
	 { 
	 return "roarrrrrrrrrrr";
	 }
 }
 public class Zoo {
 public static void main(String[] args) { 
	 new Zoo().go(); 
}
 void go() {
 Animal m = new Tiger();
 System.out.println(m.name + m.makeNoise());
 }
}
