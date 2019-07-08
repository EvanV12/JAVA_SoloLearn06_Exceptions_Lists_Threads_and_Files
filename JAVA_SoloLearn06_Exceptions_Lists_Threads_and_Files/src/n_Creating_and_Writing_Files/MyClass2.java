package n_Creating_and_Writing_Files;

import java.util.Formatter;

public class MyClass2 {

	public static void main(String[] args) {
		
		try {
			Formatter f = new Formatter("C:\\sololearn\\test.txt");
			f.format("%s %s %s", "1", "John", "Smith \r\n");			//  \r\n is the newline symbol in Windows.
			f.format("%s %s %s", "2", "Amy", "Brown");
			f.close();
		} catch (Exception e) {
			System.out.println("Error");
		}
		/* Outputs
		   1 John Smith
		   2 Amy Brown
		 */

	}

}
