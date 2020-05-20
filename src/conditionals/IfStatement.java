package conditionals;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int health = 100;
		
		if(health == 100){
			System.out.println("Your health is full!");
		}else if(health < 100){
			System.out.println(("Your health is not at full"));
		}
		
		boolean strong = true;
		
		if(health == 100 && strong){
			System.out.println("I am ready to fight the boss");
		}
		
		boolean prepared = false;
		
		if(strong || prepared){
			System.out.println("We are either strong or prepared");
		}
		
		String name = "fransco";
		
		if(name.equals("franco")){
			System.out.println("Hello franco");
		}else{
			System.out.println("I don't know who you are");
		}
		
		// !
		
		boolean bossAlive = false;
		// ! is not
		if(!bossAlive){
			System.out.println("Boss is dead");
		}
		
		Scanner s = new Scanner(System.in);
		int sc = s.nextInt();
		System.out.println("The word is " + sc);
		
		
		
	}

}
