class Example
{
static int a=10;
static int b=20;
int x=30;
int y=40;
public static void main(String[] args)
{
Example e1=new Example();
Example e2=new Example();
Example e3=null;
e1.a=50;
e1.b=60;
e1.x=70;
e1.y=80;
}
}

/*
class Example
{
int eid;
String ename;
String company;
public String toString(){
return
"eid:"+eid+"\n"+"ename:"+ename+"\n"+"company:"+company+"\n";
}
public static void main(String[] args)
{
Example e1=new Example();
e1.eid=7279;
e1.ename="Ganesh";
e1.company="Naresh IT";
System.out.println(e1);
e1=new Example();
System.out.println(e1);
}
}

//-------------------------------------------------------
class Example
{
int a=10;
int b=20;
public static void main(String[] args)
{
Example e1=new Example();
Example e2=new Example();
System.out.println(e1.a+". .."+e1.b);
System.out.println(e2.a+". .."+e2.b);
e1.a=50;
e2.b=60;
System.out.println(e2.a+". .."+e2.b);
System.out.println(e2.a+". .."+e2.b);
}
}

//---------------------------------------------------
class Example
{
int x=10;
int y=20;
public static void main(String[] args)
{
Example e1=new Example();
Example e2=new Example();
System.out.println(e1.x+" ..."+e1.y);
System.out.println(e2.x+" ..."+e2.y);
}
}
*/