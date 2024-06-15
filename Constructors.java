class Constructors {
    public static void main(String[] args) {
        new A(3);
        new B(5, 6);
        new B(6, 7).C(1, 2, 3);
        new C(3, 3, 4).B(4, 5);
        new C(1, 1, 1);
    }
}
class A {
    A(int i) {  
  print(i * 2);   
     }
    void print(int i) { 
    System.out.print(i + " ");   
    }
}
class B extends A {
    B(int j, int k) {
        super(j);
        print(k * 4);
    }
    void C(int j, int k, int l) {
      print(j + k + l - 3);   
       }
}
class C extends B {
    C(int j, int k, int l) {
        super(j, k);
        print(l - 3);
    }
    void B(int i, int k) {  
      print(i * 6);   
      }
}
