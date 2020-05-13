package basics;

public class Operators {
	
	public static void main(String[] args) {
		// String +
		String gameName = "dragon";
		gameName = gameName + " slayer" + " 1000" + 50;
		System.out.println(gameName);
		
		// + - * /
		int enemy = 10;
		int enemyHealth = 50;
		
		int totalEnemyHealth = enemy * enemyHealth;
		System.out.println("Total enemy health is " + totalEnemyHealth);
		System.out.println(50 + 10);
		System.out.println(100 - 50);
		System.out.println(100 / 10);
		
		// ++ --
		int enemiesDestroyed = 5;
		enemiesDestroyed++;
		System.out.println("Enemies destroyed: " + enemiesDestroyed);
		enemiesDestroyed--;
		System.out.println("Enemies revived: " + enemiesDestroyed);
		
		// += -= *= /=
		int playerHealth = 50;
		// DRINK A POTION
		System.out.println("The player health is at: " + playerHealth);
		System.out.println("Drinking Potion");
		playerHealth += 100;
		System.out.println("The player health is now at: " + playerHealth);
		
		// Modulus %
		
	}
	
}
