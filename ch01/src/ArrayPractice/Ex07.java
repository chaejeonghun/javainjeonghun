package ArrayPractice;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = { 76, 45, 34, 89, 100, 50, 90, 92 };

		// max������ �迭�� ���� ���� �����ϰ� ���� �� �����Ͽ� ����
		// min������ �迭�� ���� ���� �����ϰ� ū �� �����Ͽ� ����
		int sum = 0, max = 0, min = 100;

		for (int k : score) {
			sum += k;
			if (max < k)
				max = k;
		}
		System.out.println("�ִ밪 :" + max);

		for (int j : score) {
			if (min > j)
				min = j;
		}
		System.out.println("�ּҰ� :" + min);

		System.out.println("�հ� :" + sum);
		System.out.println("��� :" + sum / (double) score.length);
	}
}