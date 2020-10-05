package operator;

public class OperationEx3 {
	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;

		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value); // false
		System.out.println(num1); // 20
		System.out.println(i); // 2 �� ������ �� ���� �����̸� �� ���� ������� �ʾ� i ���� �״��

		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value); // true
		System.out.println(num1); // 30
		System.out.println(i); // 2 �� �տ��� �� ���� ���̸� �� ���� ������� �ʾ� i ���� �״��

		int num = 5;
		i = 10;

		value = ((num = num * 10) > 45) || ((i = i - 5) < 10);
		System.out.println(value); // true
		System.out.println(num); // 50
		System.out.println(i); // 10
	}
}
