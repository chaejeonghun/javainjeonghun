package ArrayPractice;

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭 ����
		// Ÿ�� ������[];
		// ������ = new Ÿ��[]{�ʱⰪ1, �ʱⰪ2, ....};

		// Ÿ�� []���� = new Ÿ��[����];
		// Ÿ��[] ���� = null;
		// ���� = newŸ��[����];
		int scores[];
		scores = new int[] { 10, 15, 5, 7, 8, 3, 9, 10, 5, 4 };
		System.out.println(scores.length);
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			sum = sum + scores[i]; // �迭�� ����� ��� ���� - �迭������[idnex ��ȣ]
		}

		double avg = sum / (double) 10;
		System.out.println("avg:" + avg);

	}

}
