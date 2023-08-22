
public class ExtendThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread starting.");
		MyThread mt = new MyThread("Child 1"); //creation of the thread child object
		mt.start(); //will start the thread's execution
		for (int j = 0; j < 50; j++) { //creation of the main thread in the main() method
			System.out.print(".");
			try {
				Thread.sleep(100);
			}
			catch (InterruptedException exc) {
				System.out.println("Main thread interrupted");
			}
		}
		System.out.println("Main thread ending.");
	}

}
