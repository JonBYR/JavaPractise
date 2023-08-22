
public class TrafficLightDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColour.GREEN);
		Thread thrd = new Thread(t1);
		thrd.start();
		for (int i = 0; i < 9 ; i++) {
			System.out.println(t1.getColour());
			t1.waitForChange();
		}
		t1.cancel();
	}

}
