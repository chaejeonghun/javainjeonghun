package Todaywork;

public class work0929plus {

	public static void main(String[] args) {
		// �⺻ Ÿ���� �� ��
		int a = 10;
		int b = 10;
		System.out.println(a == b ? "����Ÿ�� ���� a�� ����Ÿ�� ���� b�� ���� ����." : "����Ÿ�� ���� a�� ����Ÿ�� ���� b�� ���� �ٸ���.");
		System.out.println(a != b ? "����Ÿ�� ���� a�� ����Ÿ�� ���� b�� ���� �ٸ���." : "����Ÿ�� ���� a�� ����Ÿ�� ���� b�� ���� ����.");

		// ����Ÿ�� �� ��
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1 == str2 ? "str1�� str2�� ������ ����." : "str1�� str2�� ������ �ٸ���.");
		// 1. "str1�� str2�� �����ּҰ� ����.":"str1�� str2�� �����߼Ұ� �ٸ���."
		// System.out.println(str1.equals(str2)?
		// "str1�� str2�� ������ ���� ����":"str1�� str2�� ������ ���� ����x");

	}

}
