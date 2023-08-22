
public class CarShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck semi = new Truck(2, 200, 7, 44000);
		Truck pickup = new Truck(3, 28, 15, 2000); //cannot create an new object of type vehicle as it is abstract
		double gallons;
		int distance = 252;
		gallons = semi.fuelneeded(distance);
		System.out.println("Semi can carry " + semi.getCargo() + " pounds"); //call the accessor method for the semi truck
		System.out.println("To go " + distance + " miles semi needs " + gallons + " gallons of fuel.\n");
		System.out.println(pickup.getMpg()); //child can call the accessor methods of the parent class (as they are public)
		System.out.println(pickup.range()); //use of overriden abstract method
	}

}
