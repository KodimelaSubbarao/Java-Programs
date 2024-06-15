public class IAm1 {
    public static void main(String arg[]) {
        float input = 24.8888888888888889f;
        School ref = null;
        if (input < 10) {
            ref = new School();
        } else if (input > 30) {
            ref = new College();
        } else if (input == 24.88889f) {
            ref = new Office();
        }
        ref.display();
    }
}
class School {
    void display() {
        System.out.println("I am studying 10th class.");
    }
}
class College extends School {
    void display() {
        System.out.println("I am studying B.Tech.");
    }
}

class Office extends School {
    void display() {
        System.out.println("I am working in S/W company.");
    }
}
