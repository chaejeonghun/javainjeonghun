package Today1013;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {

		try {
			int a = Integer.parseInt("10");
			System.out.println(a);
			// ���ܹ߻�
			a = Integer.parseInt("��");
			System.out.println(a);
		} catch (NumberFormatException e) {
			System.out.println("���ڸ� �Է��ϼ���");
		}

	}

}