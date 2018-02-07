package minhnhut.desktop;

public class OverloadingMethod {
	public static void main(String[] args) {
		System.out.println(fn(1, 1));
		System.out.println(fn(1.0, 1.0));
		
		System.out.println(fm(1, 2, 3));
		System.out.println(fm(1, 2));
		
		System.out.println(fp(1, 2, 3, 4));
		System.out.println(fp(1, 2, 3));
	}
	
	public static int fn(int a, int b) {
		return a + b;
	}
	
	public static double fn(double a, double b) {
		return a + b + 100.0;
	}
	
	public static int fm(int a, int b, int c) {
		return a + b + c;
	}
	
	public static int fm(int a, int b) {
		return a + b;
	}
	
	public static int fp(int ...arr) {
		int sum = 0;
		for (int i: arr) {
			sum += i;
		}
		return sum;
	}
}
