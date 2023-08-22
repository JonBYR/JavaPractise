
public class Truck extends Vehicle {
	private int cargocap;
	public Truck(int p, int f, int m, int c) 
	{
		super(p, f, m); //initialises the variables of the Vehicle parent class in the child class
		cargocap = c;
	}
	public int getCargo() { return cargocap; }
	public void setCargo(int c) { cargocap = c; }
	@Override
	public int range() { //abstract method overridden
		return getMpg() * getFuelcap();
	}
}
