package b_Multiple_Exceptions;

public class MyClass {

	static int div(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("Division by Zero");
		} else {
			return a / b;
		}
	}

	/*
	 try {
  			//some code
		} catch (ExceptionType1 e1) {
  			//Catch block
		} catch (ExceptionType2 e2) {
  			//Catch block
		} catch (ExceptionType3 e3) {
  			//Catch block
		}
	 */

	public static void main(String[] args) {
		
		System.out.println(div(5, 5));
		System.out.println(div(5, 0));

	}

}
