class Grandparent {
    String name = "granparent";
    void act() {
        System.out.println(name);
    }
}

class Parent extends Grandparent 
{
    String name = "parent";
}

class Child extends Parent {
    String name = "child";
    void act() {
        System.out.println(name);
    }
}

public class Test331 {
    public static void main(String[] args) {
        Parent yo = new Child();
        yo.act();
    }
}
