package ArrayPractice;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = { 76, 45, 34, 89, 100, 50, 90, 92 };
		int temp = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] > score[j]) { // i�� ���� ũ�� j�� ���� ��ȯ
					temp = score[i]; // i�� ���� �ӽú����� ����
					score[i] = score[j]; // j�� ���� i�� ���� ��
					score[j] = temp; // �ӽ� ������ ���� �ٽ� j�� ����

				}

			}
		}
		System.out.println();
		// ���ĵ� ���� ���
		for (int i : score) {
			System.out.print(i + "   ");
		}
	}

}
