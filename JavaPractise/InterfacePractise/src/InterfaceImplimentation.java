
public class InterfaceImplimentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practise ob = new Practise();
		ob.Display(); //calling the implimented interface method
		System.out.println(ob.changeValues(3)); //can call the default method without overriding
		System.out.println(ob.callPrivateMethod()); //default method called to invoke the private interface method
	}

}
