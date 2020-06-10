package classes;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple food = new Apple();
		int bob;
		int[] names = new int[4];
		
		System.out.println(food.damage);
		
		food.Eat();
		
		
		Apple[] lotsOfFood = new Apple[100];
		for(int i = 0; i < lotsOfFood.length; i++){
			lotsOfFood[i] = new Apple();
			lotsOfFood[i].Eat();
		}
	}

}
