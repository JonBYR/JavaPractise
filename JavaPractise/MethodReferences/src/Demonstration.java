
public class Demonstration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RequiredMethods myNum = new RequiredMethods(12);
		InterfaceForMethods iM = myNum::isFactor; //to get an instance method reference, use the object name::method name
		System.out.println(iM.test(3)); //the functional interface will use the method reference passed to the interface object as the template for the method test
		iM = RequiredMethods::isPrime; //to get a static method reference, use the class name::method name
		System.out.println(iM.test(2)); //like the instance method, the static method becomes the template for test instead.
		ConstructorReference constructorCreated = RequiredMethods::new; //to create a constructor reference use class name::new
		RequiredMethods r = constructorCreated.func("Testing"); //when creating the constructor we are using the interface to pass the value as it has the template to assign the value
		System.out.println(r.getStr());
	}
	//another way for the instance method reference to work would be to have the method in the interface have two arguments test(RequiredMethods mv, int n)
	//Interface object then defined as iM = RequiredMethods::isFactor and test called as test(myNum, 3)
}
