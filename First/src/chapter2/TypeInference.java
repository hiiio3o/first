package chapter2;

public class TypeInference {
	public static void main(String[] args) {
		/*var*/ int i = 10; // int i = 10으로 컴파일됨
		/*var*/ double j = 10.0; // double j = 10.0으로 컴파일됨
		/*var*/ String str = "hello"; // String str = "hello"로 컴파일됨

		System.out.println(i);
		System.out.println(j);
		System.out.println(str);

		str = "test";
		// str = 3;
	}
}
