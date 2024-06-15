public class ExceptionExample4 {
    public static void main(String[] args) throws Exception {
        int num = 10;
        if (num > 5) {
            throw new Exception("Invalid number.");
        }
        System.out.println("End of program.");
    }
}