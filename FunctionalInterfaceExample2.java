interface NIT{
 int square(int x);
 static int add(int a, int b){
     return a+b;
 }
 static int sub(int a, int b){
     return a-b;
 }
 static int multiply(int a, int b){
     return a*b;
 }
 static int divide(int a, int b){
     return a/b;
 }
}
public class FunctionalInterfaceExample2{
 public static void main(String[] args){
     int a = 25;
     int b = 5;  
     int add = NIT.add(a,b);
     int sub = NIT.sub(a,b);
     int mul = NIT.multiply(a,b);
     int div = NIT.divide(a,b);
     System.out.print(add+" "+sub+" "+mul+" "+div+" ");
      
     NIT sq = (x) -> 
     {
    	 return x*x;
     };
     System.out.print(sq.square(6));
 }
}