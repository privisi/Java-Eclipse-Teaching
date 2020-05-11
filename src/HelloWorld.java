import java.util.Scanner;;


public class HelloWorld {

	
	private static int AddNumbers(int a, int b){
		return a + b;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		
		System.out.print("Input first number: ");
		a = s.nextInt();
		System.out.print("Input second number: ");
		b = s.nextInt();
		System.out.print("The final result is: " + AddNumbers(a, b));
	}

}
