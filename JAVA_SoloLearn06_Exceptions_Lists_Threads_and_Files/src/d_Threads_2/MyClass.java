package d_Threads_2;

public class MyClass {

	public static void main(String[] args) {
		
		Thread t = new Thread(new Loader());
		t.start();

	}

}
