public class Test 
{
	public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter the number of itmes");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
			System.out.println("Enter the item name");
            String foodName = scanner.nextLine();
            Food food = null;
			
            if (foodName.equals("Egg")) {
                food = new Egg(6.0, 5.0, 1.1);  // Example values for egg
            } else if (foodName.equals("Bread")) {
                food = new Bread(4.0, 1.1, 13.8);  // Example values for bread
            }

            for (int j = 0; j < 3; j++) {
				System.out.println("Enter the method name");
                String methodName = scanner.nextLine();
				
                if (methodName.equals("getType")) {
                    if (food instanceof Egg) {
                        System.out.println(foodName + " is " + ((Egg) food).getType());
                    } else if (food instanceof Bread) {
                        System.out.println(foodName + " is " + ((Bread) food).getType());
                    }
                } else if (methodName.equals("getTaste")) {
                    if (food instanceof Egg) {
                        System.out.println("Tasty score: " + ((Egg) food).getTaste());
                    } else if (food instanceof Bread) {
                        System.out.println("Tasty score: " + ((Bread) food).getTaste());
                    }
                } else if (methodName.equals("getMacroNutrients")) {
                    food.getMacroNutrients();
                }
            }
        }
        scanner.close();
    }
}