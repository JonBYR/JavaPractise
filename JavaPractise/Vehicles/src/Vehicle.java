
public abstract class Vehicle { //classes with one or more abstract methods must be declared as abstract classes
	private int passengers;
	private int fuelcap;
	private int mpg;
	public Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
	public abstract int range(); //abstarct methods must be empty as they will be overriden
	public double fuelneeded(int miles) //abtract classes can have non-abstract methods that will be inherited by the subclass
	{
		return (double) miles / mpg;
	}
	public int getPassengers() { return passengers; }
	public void setPassengers(int p) {passengers = p;}
	public int getFuelcap() { return fuelcap; }
	public void setFuelcap(int f) {passengers = f;}
	public int getMpg() { return mpg; }
	public void setMpg(int m) {passengers = m;} //accessor methods
}
