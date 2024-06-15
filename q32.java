class Animal 
{
      static void doStuff() 
      {
             System.out.print("a  ");
      }
}
class q32 extends Animal 
{
      static void doStuff() 
      {        
            System.out.print("d  ");
      }
      public static void main(String [] args) 
      {
            Animal [] a = {new Animal(), new q32(), new Animal()};
            for(int x = 0; x < a.length; x++)
                 a[x].doStuff();               
      }
}
