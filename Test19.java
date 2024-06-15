public class Test19 extends Singer
 {
  public static String sing() 
  {
    return "fa";
  }

  public static void main(String[] args) 
  {
    Test19 t = new Test19();
    Singer s = new Test19();
    System.out.println(t.sing() + " " + s.sing());
  }
}

class Singer {
  public static String sing() {
    return "la";
  }
}
