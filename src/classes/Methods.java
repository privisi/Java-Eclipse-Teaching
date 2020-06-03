package classes;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hello();
		
		HelloName("Benson");
		
		HelloNameAge("Franco", 11);
		
		CountFromTo(44, 77);
		CountFromTo(21, 31);
		CountFromTo(3, 6);
		
		Add(123, 456);
		
		double bob = 3/2.0;
		System.out.println(bob);
	}
	
	// Method
	public static void Hello(){
		System.out.println("Hello");
	}
	
	// Method with parameter 
	// The parameter is: String name
	static void HelloName(String name){
		System.out.println("Hello there " + name);
	}
	
	static void HelloNameAge(String name, int age){
		System.out.println("Hello there " + name + ", you are this old: " + age);
	}
	
	static void CountFromTo(int start, int end){
		for(int i = start; i <= end; i++){
			System.out.println(i);
		}
	}
	
	static void Add(int first, int second){
		int total = first + second; // Local variable
		System.out.println("The sum is: " + total);
	}
	
}

