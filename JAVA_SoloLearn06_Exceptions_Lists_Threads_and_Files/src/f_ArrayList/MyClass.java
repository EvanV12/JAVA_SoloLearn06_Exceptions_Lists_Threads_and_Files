package f_ArrayList;

import java.util.ArrayList;

public class MyClass {

	public static void main(String[] args) {
		
		ArrayList<String> colours = new ArrayList<String>(10);
		
		
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Orange");
		colors.remove("Green");
		
		System.out.println(colors);
		// Output: [Red, Blue, Orange]
		
		System.out.println(colors.contains("Blue"));
		// contains(): Returns true if the list contains the specified element  
		
		System.out.println(colors.get(2));
		// get(int index): Returns the element at the specified position in the list
		
		System.out.println(colors.size());
		// size(): Returns the number of elements in the list
		
		colors.clear();
		// clear(): Removes all of the elements from the list
		System.out.println(colors);
		// Output: []

	}

}
