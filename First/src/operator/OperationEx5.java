package operator;

public class OperationEx5 {
	public static void main(String[] args) {
		int num = 0B00000101; // 5

		System.out.println(num << 2); // 00010100 20
		System.out.println(num >> 2); // 00000001 1
		System.out.println(num >>> 2); // 00000001 1

		System.out.println(num); // 00000101 5

		num = num << 2; // 00010100 20
		System.out.println(num); // 20
	}
}
