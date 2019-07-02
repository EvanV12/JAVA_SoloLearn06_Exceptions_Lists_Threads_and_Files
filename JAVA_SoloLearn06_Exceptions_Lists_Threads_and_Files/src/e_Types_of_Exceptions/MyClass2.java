package e_Types_of_Exceptions;

public class MyClass2 {

	public static void main(String[] args) {
		
		int value = 7;
		value = value / 0;

	}

}


/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at e_Types_of_Exceptions.MyClass2.main(MyClass2.java:8)
*/