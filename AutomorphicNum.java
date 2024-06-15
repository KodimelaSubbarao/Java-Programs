public class AutomorphicNum {
public static void main(String[] args) {
    int x=6;
    int y=x*x;
    if(y%10==x%10)
        System.out.println("automorphic");
    else
        System.out.println("not");
}
}