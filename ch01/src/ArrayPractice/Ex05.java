package ArrayPractice;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] scores = { 72.5, 32.4, 48.5, 99.8, 55.4 };

		// ���� for ���� �̿��Ͽ�
		// �հ� ��� ���
		double total = 0;

		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
			total = 0;
		}
		for (double t : scores) {
			total += t;
		}
		System.out.println("�հ� :" + (int) (total * 100) / 100.0);
		System.out.printf("�հ� (�ݿø�):%.2f\n ", total);

		double avg;
		// �Ҽ��� �ڸ��� printf("%.ǥ���ҼҼ��� �ڸ���f", ��);
		avg = total / (double) scores.length;
		System.out.print("���: " + avg);
		// System.out.printf("%.3f", total/(double)scores.length)

	}

}
