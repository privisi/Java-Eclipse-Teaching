package basics;

public class Casting {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// An int is a WHOLE number 1 2 3
		// A double is a real number 1.123 0.432134 33.123
		
		int healthInt = 50;
		System.out.println("int: " + healthInt);
		double healthDouble = healthInt;
		System.out.println("double: " + healthDouble);
		
		// casting (cast)
		// slices off .99
		double enemyHealthDouble = 77.99;
		int enemyHealthInt = (int) enemyHealthDouble;
		System.out.println("Casted int: " + enemyHealthInt);
		
		
	}
	
}
