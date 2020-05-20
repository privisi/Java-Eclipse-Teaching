package conditionals;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int startHere = 5;
		
		// for ( declare a local variable ; declare a condition ; what should the variable do every loop)
		for(int i = 0; i < 10; i++){
			System.out.println(i);
		}
		
		for(int bob = 10; bob > 0; bob--){
			System.out.println("Bob's health: " + bob);
		}
		
		for(int pow = startHere; pow < 100000; pow += pow){
			System.out.println("The power is at: " + pow);
		}
		
		int[] fillMe = new int[1000];
		fillMe[startHere] = 4;
	}

}
