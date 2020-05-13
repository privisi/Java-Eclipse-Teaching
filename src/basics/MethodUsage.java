package basics;

public class MethodUsage {
	
	public static void main(String[] args) {
		// String Methods: length toUpper toLower
		String bossName = "blue eyes white dragon";
		System.out.println("Hello " + bossName);
		// The . is what asks to use the method
		// human.eat() or human.sleep();
		bossName = bossName.toUpperCase();
		System.out.println("MY NAME IS " + bossName);
		
		String howLongAmI = "dhgime4fufigy478drgyhudkuihtrfwrjvrgriwerbegfeqeyrwewerwerr";
		System.out.println("We are this long: " + howLongAmI.length());
		
		double number1 = 5123.32;
		double number2 = 132123.123;
		System.out.println("The largest number is: " + Math.max(number1, number2));
		
	}
	
}
