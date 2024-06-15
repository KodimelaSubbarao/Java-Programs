import java.util.*;
class PhoneNumber
{
	public static void main(String[] args) 
	{
		Random	random=new Random();
		int firstDigit = 6 + random.nextInt(4);

        // Generate the remaining 9 digits (0-9)
        long remainingDigits = random.nextLong();

        // Ensure it's positive and 9 digits long
        remainingDigits = Math.abs(remainingDigits) % 1000000000L;

        // Combine the first digit and remaining digits
        long phoneNumber = firstDigit * 1000000000L + remainingDigits;
		System.out.println("Hello World! "+phoneNumber);
	}
}
