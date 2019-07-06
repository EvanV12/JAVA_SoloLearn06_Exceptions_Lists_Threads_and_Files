package k_Iterators;

import java.util.Iterator;
import java.util.LinkedList;

public class MyClass {

	public static void main(String[] args) {
		
		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");
		
		Iterator<String> it = animals.iterator();
		String value = it.next();
		System.out.println(value);
		// Outputs "fox"
		
		// it.next() returns the first element in the list and then moves the iterator on to the next element.
		// Each time you call it.next(), the iterator moves to the next element of the list.
		
		// hasNext(): Returns true if there is at least one more element; otherwise, it returns false.
		// next(): Returns the next object and advances the iterator.
		// remove(): Removes the last object that was returned by next from the collection.

	}

}
