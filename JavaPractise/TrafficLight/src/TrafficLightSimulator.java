
public class TrafficLightSimulator extends Thread {
	private TrafficLightColour tlc; //object for the enumerator, doesn't require the new keyword
	private boolean stop = false;
	private boolean changed = false;
	TrafficLightSimulator(TrafficLightColour init) {
		tlc = init;
	}
	TrafficLightSimulator() {
		tlc = TrafficLightColour.RED; //enums object will store the static enum variable
	}
	public void run() {
		while (!stop) { //once stop is set to true the program will end
			try {
				switch(tlc) { //checks the value of the enum Constant
				case GREEN:
					Thread.sleep(10000);
					break; //always remember that each case statement needs a break at the end
				case YELLOW:
					Thread.sleep(2000);
					break;
				case RED:
					Thread.sleep(12000);
					break;
				}
			}
			catch (InterruptedException exc) {
				System.out.println(exc);
			}
			changeColour();
		}
	}
	synchronized void changeColour() { //must be synchronized for the notify() call
		switch(tlc) {
		case RED:
			tlc = TrafficLightColour.GREEN;
			break;
		case YELLOW:
			tlc = TrafficLightColour.RED;
			break;
		case GREEN:
			tlc = TrafficLightColour.YELLOW;
			break;
		}
		changed = true;
		notify(); //informs other threads that lights have been changed 
	}
	synchronized void waitForChange() {
		try {
			while(!changed) wait();
			changed = false; //while changed is false, the thread waits, until it is changed back to true, where in which it will change back to false again
		}
		catch (InterruptedException exc) {
			System.out.println(exc);
		}
	}
	synchronized TrafficLightColour getColour() {
		return tlc; //returns the enum constant RED, YELLOW or GREEN
	}
	synchronized void cancel() {
		stop = true;
	}
}
