
public class MyThread extends Thread { //allows for the inheritance of the thread abstract class with abstract methods to create a new Thread
	//as opposed to implimenting the interface
	MyThread(String name) {
		super(name); //calls super to use the thread class's constructor for the name
	}
	public void run() { //impliment the body for the abstract method run
		System.out.println(getName() + " starting"); //call the getName() method in thread
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(400); //delay for each iteration
				System.out.println("In " + getName() + ", count is" + i);
			}
		}
		catch (InterruptedException exc) { //exception for when the thread is interupted by another thread before execution finishes
			System.out.println(getName() + " interrupted.");
		}
		System.out.println(getName() + " terminating.");
	}
	//can also create a new Thread by making a public static object method like so
	//public static MyThread createAndStart(stringName) {
	//     MyThread myThrd = new MyThread(name) (calls the constructor in the static method to create the MyThread object)
	//     myThrd.start() //starts the thread
	//     return myThrd; (returns the created thread object)
	// }
}
//In the main method you would MyThread mt will equal MyThread.createAndStart("Child 1") instead and mt.start() would be removed