package exercises;

public class Lesson2Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] grid = new int[10][10];
		for(int column = 0; column < 10; column++){
			for(int row = 0; row < 10; row++){
				grid[column][row] = 10 * column + row;
				System.out.println("grid[" + column + "][" + row + "] = " + grid[column][row]);
			}
		}
		
	}

}
