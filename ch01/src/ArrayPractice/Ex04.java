package ArrayPractice;

public class Ex04 {

	public static void main(String[] args) {
		int[] score = { 78, 98, 54, 76, 87 };
		System.out.println("�迭�� ����:" + score.length);
		// ����
		int total = 0;
		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}
		System.out.println("���� :" + total);

		// ��� double Ÿ�� ���·� ���
		double avg = 0.0; // 0 -> 0.0 �ڵ� ����ȯ
		avg = total / (double) score.length;
		System.out.println("��� :" + avg);

		// ���� for �� Ȱ��
		total = 0; // �� �缳��
		for (int s : score) {
			total += s;
			System.out.println(total += s);

		}
		avg = total / (double) score.length;
		System.out.println("���: " + avg);

	}
}
