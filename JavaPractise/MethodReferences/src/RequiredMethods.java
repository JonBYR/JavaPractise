
public class RequiredMethods {
	private int v;
	private String str;
	RequiredMethods(int x) { v = x;}
	int getNum() {return v;}
	RequiredMethods(String s) { str = s; }
	boolean isFactor(int n) {
		return (v % n) == 0;
	}
	static boolean isPrime(int n) {
		if (n < 2) return false;
		for (int i = 2; i <= n/i; i++) {
			if ((n % i) == 0) return false;
		}
		return true;
	}
	static boolean isEven(int n) {
		return (n % 2) == 0;
	}
	static boolean isPositive(int n) {
		return n > 0;
	}
	String getStr() {return str;}
}
