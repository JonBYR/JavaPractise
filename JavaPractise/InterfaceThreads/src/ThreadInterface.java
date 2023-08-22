
public class ThreadInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadTwo mt = new MyThreadTwo("Child 2"); //creation of the MyThread object
		Thread newThread = new Thread(mt); //MyThread object must be passed to the Thread class to operate 
		newThread.start(); //will impliment the start method
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
