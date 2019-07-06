package l_Working_with_Files;

import java.io.File;

public class MyClass {

	public static void main(String[] args) {
		
		File x = new File("C:\\sololearn\\test.txt");
		
		if(x.exists()) {
			System.out.println(x.getName() + " exists!");
		}
		else {
			System.out.println("The file does not exist");
		}

	}

}
