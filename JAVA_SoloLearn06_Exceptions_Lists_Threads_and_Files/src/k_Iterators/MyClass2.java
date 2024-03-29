package k_Iterators;

import java.util.Iterator;
import java.util.LinkedList;

public class MyClass2 {

	public static void main(String[] args) {
		
		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");
		
		Iterator<String> it = animals.iterator();
		
		while(it.hasNext()) {
			String value = it.next();
			System.out.println(value);
		}
		/* Outputs
		   fox
		   cat
		   dog
		   rabbit
		*/

	}

}
