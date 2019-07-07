package m_Reading_a_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {

		try {
			File x = new File("C:\\sololearn\\test.txt");
			Scanner sc = new Scanner(x);
		}
		catch (FileNotFoundException e) {

		}
	}
}
