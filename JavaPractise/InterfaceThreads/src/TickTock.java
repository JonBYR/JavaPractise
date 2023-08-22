
public class TickTock {
	String state; //determines the state of the clock
	synchronized void tick(boolean running) { //use of keyword synchronized means that it can only be used by one thread at a time
		if (!running) { //if running is false
			state = "ticked";
			notify(); //will inform the other threads of changes
			return; //ends the function
		}
		System.out.print("Tick: ");
		state = "ticked";
		notify(); //as it satisfies the condition for tock(), the method will execute
		try {
			while(!state.equals("tocked")) {
				wait(); //while the state is not tocked, the thread will wait and not execute until the state returns as tocked
			}
		}
		catch (InterruptedException exc) {
			System.out.println("Thread interrupted.");
		}
	}
	synchronized void tock(boolean running) { //use of keyword synchronized means that it can only be used by one thread at a time
		if (!running) { //if running is false
			state = "tocked";
			notify(); //will inform the other threads of changes
			return; //ends the function
		}
		System.out.print("Tock: ");
		state = "tocked";
		notify();
		try {
			while(!state.equals("ticked")) {
				wait(); //while the state is not ticked, the thread will wait and not execute until the state returns as ticked
			}
		}
		catch (InterruptedException exc) {
			System.out.println("Thread interrupted.");
		}
	}	
}
