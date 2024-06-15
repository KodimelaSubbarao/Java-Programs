public class Gamma extends Beta {
void m1(Beta b) {	
 System.out.println("Two");
 super.m1(new Beta());
 }
}