package Today0930af;

//public Ű����� �ܺο��� ���� ������ ���� ��������.
public class Calculator {
	// �𵨸��� �����Ǹ� �ȵ�
	public final String model = "00001";
	// result ���� getCalc�� ���ؼ� ó���� ���� ����.
	// public�� private�� ����� �ܺο��� �ش� Ŭ������ ������ �Ұ����ϴ�.
	public double result = 0;
	// ���� Ŭ�������� �޼ҵ� �鳢���� ��ȣ ȣ�Ⱑ��
	public String resultNumber = "";

	public void getCalc(String user, String op, int x, int y) {
		if (user.equals("admin")) {
			resultNumber = "99999";
			resultNumber = "00000";
		}
		switch (op) {
		case "+":
			result = add(x, y);
			System.out.println(result);
			break;

		case "-":
			result = sub(x, y);
			System.out.println(result);
			break;

		case "X":
			result = mul(x, y);
			System.out.println(result);
			break;

		case "/":
			result = div(x, y);
			System.out.println(result);
			break;
		}
		System.out.println(resultNumber);
	}

	// public�� private�� ����� �ܺο��� �ش� Ŭ������ ������ �Ұ����ϴ�.
	// �Ʒ��� �޼ҵ� ���� getCalc()�޼ҵ常 ȣ�Ⱑ�� - �ܺο��� ȣ��Ұ�
	public int add(int x, int y) {
		return x + y;
	}

	public int sub(int x, int y) {
		return x - y;
	}

	public int mul(int x, int y) {
		return x * y;
	}

	public double div(int x, int y) {
		return x / (double) y;
	}
}
