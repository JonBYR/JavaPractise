
public class LambdaPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inStr = "Lambda expressions expand Java";
		String outStr;
		StringFunc reverse = (str) -> { //reference to an interface object, with a lambda body created to define the body of the abstract interface method
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
			return result; //lambda body interacts the same way as a method
		}; //semi colon needed at the end of a lambda body
		outStr = LambdaArgumentDemo.changeStr(reverse, inStr); //as the interface method has been defined for the reverse object we can pass it
		System.out.println(outStr);
		//and expect it to be used in changeStr (as it calls func() in the static method
		outStr = LambdaArgumentDemo.changeStr((str) -> str.replace(' ', '-'), inStr); //the lambda expression for the interface can be passed as an argument to the static method
		outStr = LambdaArgumentDemo.changeStr((str) -> {
			String result = "";
			char ch;
			for (int i = 0; i < str.length(); i++) {
				ch = str.charAt(i);
				if (Character.isUpperCase(ch)) result += Character.toLowerCase(ch);
				else result += Character.toUpperCase(ch);
			}
			return result;
		}, inStr); //lambda bodys for the interface method can also be used as an argument
		System.out.println("Here is the imput string:" + inStr);
		System.out.println("Here is the output string:" + outStr);
		System.out.println(reverse.func(inStr)); //calling the interface with the lambda expression defined
	}
}
