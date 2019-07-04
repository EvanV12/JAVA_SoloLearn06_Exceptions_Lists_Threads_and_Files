package j_Sorting_Lists;

import java.util.ArrayList;
import java.util.Collections;

public class MyClass2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(3);
		nums.add(36);
		nums.add(73);
		nums.add(40);
		nums.add(1);
		
		Collections.sort(nums);
		
		System.out.println(nums);
		// Outputs: [1, 3, 36, 40, 73]
		
		System.out.println(Collections.max(nums));
		// Collections.max(): Returns the maximum element as determined by natural ordering
		
		System.out.println(Collections.min(nums));
		// Collections.min(): Returns the minimum element as determined by natural ordering
		

	}

}
