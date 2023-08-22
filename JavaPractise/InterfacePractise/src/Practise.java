
public class Practise implements IPractise { //keyword for an interface
	public void Display() { //any public methods from the interface must have a body declared for use in the class
		System.out.println("This is how an interface works");
		System.out.println(IPractise.displayFinalValue()); //to call a static method from an interface you must do Interfacename.staticMethod
	}
	
}
