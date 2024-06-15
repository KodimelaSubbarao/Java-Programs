public class Test55 {     
    int a = 10;
    
    public void doStuff(int a) {
        a += 1;
        System.out.println(a++);
    }
    public static void main(String args[]) {
        Test55 t = new Test55();
        t.doStuff(3);
    }
}
