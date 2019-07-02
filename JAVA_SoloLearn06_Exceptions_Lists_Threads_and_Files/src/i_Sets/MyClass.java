package i_Sets;

import java.util.HashSet;

public class MyClass {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("A");
		set.add("B");
		set.add("C");
		
		System.out.println(set);
		// Output: [A, B, C]
		
		System.out.println(set.size());
		// You can use the size() method to get the number of elements in the HashSet.
		

	}

}
