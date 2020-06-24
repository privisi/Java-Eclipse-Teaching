package Intermediate;

import java.util.Random;

public class RandomPercentage {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++){
			RandomChance(69, 100);	
		}
		
	}
	
	public static void RandomChance(int chance, int amount){
		Random r = new Random();
		if(r.nextInt(amount) < chance){
			System.out.println("You passed!");
		}else{
			System.out.println("You failed!");
		}
	}

}
