
public class ThreadCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TickTock tt = new TickTock(); //creation of object to pass to the threads
		TickThread t1 = TickThread.createAndStart("Tick", tt);
		TickThread t2 = TickThread.createAndStart("Tock", tt);
		try {
			t1.join();
			t2.join(); //will make sure the threads are finished before the main thread finishes
		}
		catch (InterruptedException exc) {
			System.out.println("Main thread interrupted");
		}
	}

}
