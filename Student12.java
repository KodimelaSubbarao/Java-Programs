class Laptop
{
void access()
{
System.out.println("Copy java soft copies... ");
}
}
class Faculty
{
static Laptop password = new Laptop();
}
class Student12
{
public static void main(String[] args)
{
Faculty.password.access();
}
}
