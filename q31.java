class Animal { }
class Horse extends Animal { }
class q31
{
      public void doStuff(Animal a) 
      {
           System.out.println("In the Animal version");
      }
      public void doStuff(Horse h) 
      {
           System.out.println("In the Horse version");
      }
      public static void main (String [] args) 
      {
            q31 q = new q31();
            Animal ob1 = new Animal();
            Animal ob2 = new Horse();
            q.doStuff(ob1);
            q.doStuff(ob2);
     }
}

