package Today1005;

public class MethodMainExam {

	public static void main(String[] args) {
		// �޼ҵ带 �����ϰ� �ִ� Ŭ������ ��ü ����
		MethodExam m = new MethodExam();
		// ���������� �޼ҵ� ����
		// 1. ����(�Ű����� o, ����Ÿ��o)
		// ù ��° ����, �� ��° ������ �޾Ƽ� ������ �����
		// intŸ������ �ǵ��� ��.
		int result = m.sum(10, 10); // ȣ��� ������ �Ű������� ����
		System.out.println(result);

		// 2.����(�Ű����� x, ����Ÿ�� o)
		String str1 = m.greeting();
		System.out.println(str1);

		// 3.���� (�Ű����� o, ����Ÿ�� x)
		// void�� ������ �޼ҵ�� ���� ������ ����
		m.sumVoid(10, 30);

		// 4.���� (�Ű����� x, ����Ÿ�� x)
		// void�� ������ �޼ҵ�� ���� ������ ����
		m.greetingVoid();

	}

}
