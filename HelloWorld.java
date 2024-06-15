package practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class HelloWorld
{
    String n;
    int a;
    HelloWorld(String n,int a)
    {
        this.n=n;
        this.a=a;
    }
    public static void main(String[] args) {
        HelloWorld hw=new HelloWorld("sa",23);
        HelloWorld hw1=new HelloWorld("raj",12);
        HelloWorld hw2=new HelloWorld("rani",17);
        HelloWorld hw3=new HelloWorld("ksr",18);
        HelloWorld hw4=new HelloWorld("aa",22);
        Predicate<Integer> p=(n)-> n <18;
        List<HelloWorld> l=Arrays.asList(hw,hw1,hw2,hw3,hw4);
        for(HelloWorld h:l)
        {
            if(p.test(h.a))
            {
                 System.out.println(h.n);
            }
        }

    }
}
