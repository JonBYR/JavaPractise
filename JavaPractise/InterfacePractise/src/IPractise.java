
public interface IPractise {
	public void Display(); //interfaces normally contain public methods that are abstract and so have to be overriden in teh class
	public int FINALVALUE = 12; //variables declared in an interface are public, final and static
	default int changeValues(int n) //interface can have a default method that doesn't have to be overriden
	{
		return n;
	}
	static int displayFinalValue() { //interface can have static methods
		return FINALVALUE;
	}
	default String callPrivateMethod() 
	{
		return privateMessage();
	}
	private String privateMessage() //interface can have private methods but they must be called by a default method in the interface
	{
		return "This is a private message";
	}
}
