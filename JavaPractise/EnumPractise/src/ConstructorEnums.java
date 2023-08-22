
public class ConstructorEnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transport tp1, tp2; //declare a enum object type
		System.out.println("Typical speed of an airplane is " + Transport.AIRPLANE.getSpeed() + "miles per hour\n");
		//how to access the method of a specific constant from Transport itself
		System.out.println("All Transport speeds");
		for (Transport t : Transport.values()) { //Transport.values() returns an array containing each enum from CAR to BOAT
			System.out.println(t + "typical speed is" + t.getSpeed() + " miles per hour"); //t will store the enum constant so only need to call the object reference
		}
		System.out.println(Transport.CAR.ordinal()); //will use the enum method to show the constants position in the list of constants
		tp1 = Transport.CAR;
		tp2 = Transport.BOAT;
		if (tp1.compareTo(tp2) < 0) { //will compare the ordinal value of both objects
			System.out.println("Ordinal of tp1 is lower than tp2");
		}
		else if (tp1.compareTo(tp2) == 0) {
			System.out.println("Ordinals are the same");
		}
		else {
			System.out.println("Ordinal of tp1 is greater than tp2");
		}
	}

}
