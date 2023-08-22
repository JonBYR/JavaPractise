
public class TickThread extends Thread {
	TickTock ttOb;
	TickThread(String name, TickTock tt) {
		super(name);
		ttOb = tt; //create a reference to the object stored in ttOb
	}
	public static TickThread createAndStart(String name, TickTock tt) {
		TickThread newThread = new TickThread(name, tt);
		newThread.start();
		return newThread;
	}
	public void run() {
		if(getName().compareTo("Tick") == 0) { //checking the name of the thread that was passed to the thread constructor, so this thread only executes tick()
			for(int i = 0; i <5; i++) ttOb.tick(true); //will execute five times
			ttOb.tick(false); //will end the method
		}
		else {
			for(int i = 0; i<5; i++) ttOb.tock(true); //this thread only executes tock()
			ttOb.tock(false);
		}
	}
}
