package Today1005af2;

public class ValuePassing {
	public static void main(String[] args) {
		int n = 10;
		// �Ű����� ������ �⺻Ÿ�� int 10�� ���� ���޵� (�� ����)
		increase(n);

		// n�� increase()�޼ҵ忡 ���� ������ ���� ����.
		System.out.println(n);
	}

//���ǵǾ� �Ѿ�� int 10�� �޾Ƽ� �޼ҵ峻���� ó��.
	static void increase(int m) {
		m = m + 1;
	}

}
