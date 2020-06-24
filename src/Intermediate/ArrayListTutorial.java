package Intermediate;

import java.util.ArrayList;

public class ArrayListTutorial {

	public static void main(String[] args) {
		ArrayList<String> items = new ArrayList<String>();
		
		items.add("helmet");
		items.add("potion");
		items.add("sword");
		items.add(1, "added a new item");
		items.set(3, "bow");
		items.add("trash");
		items.remove("trash");

		for(int i = 0; i < items.size(); i++){
			System.out.println(items.get(i));
		}
		
		System.out.println("Does our inventory have trash?");
		System.out.println(items.contains("trash"));
		System.out.println("Does our inventory have potion?");
		System.out.println(items.contains("potion"));
		
		//Heres some other types of arraylists;
		ArrayList<Integer> ints = new ArrayList<Integer>(); // int
		ArrayList<Double> doubles = new ArrayList<Double>(); // double
		ArrayList<Character> characters = new ArrayList<Character>(); // char
		ArrayList<Boolean> booleans = new ArrayList<Boolean>(); // boolean
		
		ints.add(1);
	}

}
