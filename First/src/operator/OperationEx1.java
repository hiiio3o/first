package operator;

public class OperationEx1 {
	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		int korScore = 53;

		int totalScore = mathScore + engScore + korScore;	//���� ���ϱ�
		System.out.println(totalScore);

		double avgScore = totalScore / 3.0;		//��� ���ϱ�
		System.out.println(avgScore);
	}
}
