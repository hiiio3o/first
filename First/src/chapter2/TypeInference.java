package chapter2;

public class TypeInference {
	public static void main(String[] args) {
		/*var*/ int i = 10; // int i = 10���� �����ϵ�
		/*var*/ double j = 10.0; // double j = 10.0���� �����ϵ�
		/*var*/ String str = "hello"; // String str = "hello"�� �����ϵ�

		System.out.println(i);
		System.out.println(j);
		System.out.println(str);

		str = "test";
		// str = 3;
	}
}
