interface NIT{
 int square(int x);
 default int add(int a, int b){
     return a+b;
 }
 default int sub(int a, int b){
     return a-b;
 }
 static int multiply(int a, int b){
     return a*b;
 }
 static int divide(int a, int b){
     return a/b;
 }
}
public class FunctionalInterfaceExample1 implements NIT{
 public static void main(String[] args){
     int a = 25;
     int b = 5;
     FunctionalInterfaceExample1 fun = new FunctionalInterfaceExample1();
     int add = fun.add(a,b);
     int sub = fun.sub(a,b);
     int mul = NIT.multiply(a,b);
     int div = NIT.divide(a,b);
     System.out.println(add+" "+sub+" "+mul+" "+div+" "+fun.square(6));
} 
 @Override
 public int square(int x) {
     return x*x;
 }
}