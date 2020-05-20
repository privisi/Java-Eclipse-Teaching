package conditionals;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		
		while (count < 10){
			System.out.println("The current count is: " + count);
			System.out.println("Is this count " + count + " < 10");
			count++;
		}
		
		// Dangerous!
		/*
		while (true){
			System.out.println("true");
		}
		*/
		boolean alive = false;
		
		// while (THIS IS TRUE) { DO STUFF }
		
		while(alive){
			System.out.println("we are false");
		}
		
		// A while loop will keep running if the condition is TRUE
		// but will stop running if the condition is false
		
	}

}
