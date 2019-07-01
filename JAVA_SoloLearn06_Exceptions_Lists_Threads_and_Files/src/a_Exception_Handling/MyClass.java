package a_Exception_Handling;

public class MyClass {

	public static void main(String[] args) {
		
		try {
			int a[] = new int[2];
			System.out.println(a[5]);
		} catch (Exception e) {
			System.out.println("An error occurred");
		}

	}

}

// Outputs "An error occurred"