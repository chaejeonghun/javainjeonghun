package Today1005af;

public class Ex05 {
	public static void main(String[] args) {
		E1 e1 = new E1();
		e1.greet(7);
	}

}

class E1 {
	// �Ű����� o, ����Ÿ�� x
	// �ڱ��ڽ��� ȣ���ϴ� �޼ҵ� - ���ȣ�� �޼ҵ�
	void greet(int x) {
		System.out.println("�ȳ� :" + x);
		if (x < 1)
			return; // void �޼ҵ� ���� return�� ���� ����.
		greet(--x);

	}
}