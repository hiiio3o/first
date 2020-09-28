package operator;

public class OperationEx1 {
	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		int korScore = 53;

		int totalScore = mathScore + engScore + korScore;	//ÃÑÁ¡ ±¸ÇÏ±â
		System.out.println(totalScore);

		double avgScore = totalScore / 3.0;		//Æò±Õ ±¸ÇÏ±â
		System.out.println(avgScore);
	}
}
