package ArrayPractice;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int s1 = 10; int s2 = 15; int s3 = 5; int s4 = 7; int s5 = 8; int s6 = 3; int
		 * s7 = 9; int s8 = 10; int s9 = 5; int s10 = 4;
		 */
		// �迭 ����
		// Ÿ�� ������ [] = {�ʱⰪ 1, �ʱⰪ 2, ....};
		// Ÿ�� [] ���� �� = new Ÿ��[������ ��� ����];
		// int[] scores = new int[10];

		// ���� Ÿ���� ���� ������� �����ؼ� �����.
		// �迭�� index ������ 0����
		int[] scores = new int[10];
		scores[0] = 10;
		scores[1] = 15;
		scores[2] = 5;
		scores[3] = 7;
		scores[4] = 8;
		scores[5] = 3;
		scores[6] = 9;
		scores[7] = 10;
		scores[8] = 5;
		scores[9] = 4;

		// �迭 ����������.length = �迭�� ���� (���� ���� ���� ����)
		// �迭 ���������� .length�� �ϱ� ���� ����, �迭 ������ �ڵ����� �迭�� ���̰����� �ʱ�ȭ

		System.out.println(scores.length);
		// scores.length=20;
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			sum = sum + scores[i]; // �迭�� ����� ��� ���� - �迭������[idnex ��ȣ]
		}

		double avg = sum / (double) 10;
		System.out.println("avg:" + avg);

	}

}
