package n_Creating_and_Writing_Files;

import java.util.Formatter;

public class MyClass {

	public static void main(String[] args) {
		
		try {
			Formatter f = new Formatter("C:\\sololearn\\test.txt");
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

}
