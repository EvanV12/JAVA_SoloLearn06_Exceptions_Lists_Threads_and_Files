package j_Sorting_Lists;

import java.util.ArrayList;
import java.util.Collections;

public class MyClass {

	public static void main(String[] args) {


		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("tiger");
		animals.add("cat");
		animals.add("snake");
		animals.add("dog");
		
		Collections.sort(animals);
		
		System.out.println(animals);
		// Outputs: [cat, dog, snake, tiger]

	}

}
