package exercises;

public class Homework4Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] challenge = new int[30];
		for(int i = 0; i < challenge.length; i++){
			challenge[i] = i+1;
		}
		
		for(int i = 0; i < challenge.length; i++){
			if(i != 0){
				challenge[i] = challenge[i] + challenge[i-1];
			}
			System.out.println(challenge[i]);
		}
		
		
		
		
	}

}
