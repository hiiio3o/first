package chapter2;

public class Example {
	public static void main(String[] args) {
		byte b = 10;
		double d = 2.0;

		System.out.println((int) (b + d));
		System.out.println((int) (b - d));
		System.out.println((int) (b * d));
		System.out.println((int) (b / d));

		char ch = '\uAE00';
		System.out.println(ch);
	}
}
