package Intermediate;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListTutorial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Medicine> meds = new ArrayList<Medicine>();
		meds.add(new Medicine("Covid-19 Vaccine"));
		meds.add(new Medicine("Ebola medicine"));
		meds.add(new Medicine("Paracetamol"));
		
		EatMedicine(meds);
		
		
		
		// crazy stuff for fun
		ArrayList<ArrayList<Integer[]>> crazy = new ArrayList<ArrayList<Integer[]>>();
		crazy.add(new ArrayList<Integer[]>());
		crazy.get(0).add(new Integer[4]);
		crazy.get(0).get(0)[0] = 1;
		System.out.println(crazy.get(0).get(0)[0]);
	}
	
	static public void EatMedicine(ArrayList<Medicine> meds){
		Random r = new Random();
		int num = r.nextInt(meds.size());
		System.out.println("Eating a random medicine: " + meds.get(num).name);
		meds.remove(num);
		
		System.out.println("Medicines left: ");
		for(int i = 0; i < meds.size(); i++){
			System.out.println(meds.get(i).name);
		}
	}
	// for example you can call methods or variables like this too:
	// meds.get(i).killvirus(); if the method killvirus exists
	// meds.get(i).power = 1000; if you have a power variable inside
}
