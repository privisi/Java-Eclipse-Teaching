package classes;

public class Methods2 {

	public static void main(String[] args) {
		HelloAgain();
		int powerLevel = CalculatePowerLevel();
		System.out.println("Your powerlevel is at " + powerLevel);
		
		System.out.println("Here is your char " + GiveBackChar());
	}
	
	static void HelloAgain(){
		System.out.println("Welcome to more advanced methods");
	}
	
	static int CalculatePowerLevel(){
		return 1000;
	}
	
	static char GiveBackChar(){
		return 'p';
	}
	
	

}
