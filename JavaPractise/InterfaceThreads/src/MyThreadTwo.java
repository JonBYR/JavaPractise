
public class MyThreadTwo implements Runnable { //instead of using the abstract class the interface is used instead
	String thrdName;
	MyThreadTwo(String name) {
		thrdName = name;
	}
	public void run() { //impliment the body for the abstract method run from the interface
		System.out.println(thrdName + " starting"); //call the thrdName variable
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(400); //delay for each iteration
				System.out.println("In " + thrdName + ", count is" + i);
			}
		}
		catch (InterruptedException exc) { //exception for when the thread is interupted by another thread before execution finishes
			System.out.println(thrdName + " interrupted.");
		}
		System.out.println(thrdName + " terminating.");
	}
}
//this implimentation can be streamlined by making a Thread variable that will be called by a constructor
//Example
//Thread thrd
//MyThreadTwo (String name) {
//   thrd = new Thread(this, name) //constructor of Thread called that will create a new Thread object with a new name
// }
//public static MyThread createAndStart(stringName) {
	//     MyThreadTwo myThrd = new MyThreadTwo(name) (calls the constructor in the static method to create the MyThreadTwo object)
	//     myThrd.thrd.start() //starts the thread on the child object (has to call method on the parent object)
	//     return myThrd; (returns the created thread object)
// }
// In main only have to do MyThreadTwo mt = new MyThread.createAndStart("Child 2");