//1. Write '4' methods in a class [Excluding main()]
//2.all the method should be parameterized nethods(minimum 2 parameters)
//3.There should not be any void methods
//4.You need to use the value returned by the method
//5.Every method should return a value
//6.From the Main() call only one method
//7. Every method should be executed


// order off output is defined as numbers 

public class Task1 {

    /* 
    int meth1(int i , String s) // main() called ==> i=23 ,s="Years old" passed
    {
        System.out.println("Meth1 is called"); //2
        String a="Raja is "; //3
        System.out.print(a); //4
        System.out.print(i); //5
        System.out.println(s);  //6
        System.out.println("Meth1 is Ended"); //7
        return new Task1().meth2(10,20,30); // meth2 return value is stored ==> 10
    }
    int meth2 (int x , int y ,int z) //meth1() called ==> x=10,y=20,z=30
    {
        System.out.println("Meth2 is called"); //8
        System.out.println("x: "+x);  //9
        System.out.println("y: "+y); //10
        System.out.println("z: "+z);  //11
        String n= new Task1().meth4("Hello ","World");   //meth4() return value is strored ==>"Java is Awesome"
        System.out.println(n);  //22
        System.out.println("Meth2 is Ended");  //23
        return 10; 
    } 
    String meth3(int b, String s) //meth3() called ==> b=20 ,s="KSR"
    {
        System.out.println("Meth3 is called"); //13
        System.out.println(b);  //14
        System.out.println("Java is a Object Oriented Programming Language");  //15
        System.out.println(s);  //16
        System.out.println("Meth3 is Ended");  //17
        return "NTR";
    }
    String meth4(String p, String q) //meth2() called ==> p="Hello" , q="World"
    {
        System.out.println("Meth4 is called");  //12
        String s=new Task1().meth3(20,"KSR");   //meth3() return values is stored ==> "NTR"
        System.out.println(s);  //18
        System.out.print(p); //19
        System.out.println(q); //20
        System.out.println("Meth4 is Ended");  //21
        return "Java is Awesome";
        
    }
    public static void main(String [] args)
    {
        System.out.println("Start"); //1
        int num=new Task1().meth1( 23 ," Years old ");  // meth1() return value is stored ==> 10
        System.out.println(num); //24
        System.out.println("End"); //25
    }
    */
    public static void main(String[] args)
    {
        String str=new String("hey").intern();
        String str1=new String("hey").intern();
        System.out.println(str1==str);
    }
}
