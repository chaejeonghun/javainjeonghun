package ch05;

public class OperatorExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v1 = 5;
		int v2 = 2;
		System.out.println(v1 + v2);
		System.out.println(v1 - v2);
		System.out.println(v1 * v2);

		// ����/���� -> ������ ������ ���
		System.out.println(v1 / v2);
		// ����/�Ǽ� -> �Ǽ�
		System.out.println(v1 / (double) v2);

		// ������ ��� -> ����%���� -> ����Ÿ���� ������ ���
		System.out.println(v1 % v2); // 5 = 2*2(��) +1(������)
	}

}
