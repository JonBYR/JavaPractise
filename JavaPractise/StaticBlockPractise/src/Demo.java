
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock demo = new StaticBlock("Inside Constructor"); //Constructor will be initialised but static block will execute first
		System.out.println(StaticBlock.sqr1);
		System.out.println(StaticBlock.sqr2); //remember that you can only use the class name to access static methods
	}

}
