package conditionals;

public class Arrays {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		
		System.out.println(numbers[2]);
		
		int[][] multiNumbers = new int[4][2];
		multiNumbers[2][1] = 123123;
		
		System.out.println(multiNumbers[2][1]);
		
		int[][][][][] woah = new int [1][1][1][1][1];
		
	}

}
