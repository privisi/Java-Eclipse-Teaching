package basics;
// Get random from something else in your computer
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomNumberGenerator = new Random();
		// Prints a random number in between 0 and 49
		System.out.println("The random number is: " + randomNumberGenerator.nextInt(50));
	}

}
