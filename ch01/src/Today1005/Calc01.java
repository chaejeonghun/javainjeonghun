package Today1005;

public class Calc01 {
//
	int i = 0, j = 0;

//�� -1���� (�Ű����� o ����Ÿ�� o)
	public int add(int x, int y) {
		return x + y;
	}

//������ - 2���� (�Ű����� x ����Ÿ�� o)
	public int divid() {
		return i / j;
	}

//���� - 3���� (�Ű����� o ����Ÿ�� x)
	public void sub(int x, int y) {
		System.out.println(x - y);
	}

//���ϱ� - 4���� (�Ű����� x ����Ÿ�� x)
	public void mul() {
		System.out.println(i * j);
	}
}
