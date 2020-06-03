package conditionals;

public class Breaks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a break, literally breaks out of a loop or whatever it's doing
		
		for(int i = 0; i < 9999999 ; i++){
			System.out.println("We are at: " + i);
			if(i == 10){
				System.out.println("We've reached 10, lets stop!");
				break;
			}
		}
		int b = 0;
		while(true){
			if(b == 10){
				System.out.println("Weve reached 10 on B");
				break;
			}
			System.out.println("The loop is at: " + b);
			b++;
		}
		
	}

}
