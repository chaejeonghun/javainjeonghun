package Today1006Mor;

public class Init4Ex {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		p1.print();
		p2.print();
		p3.print();

	}
}

class Product {
	// static �ʵ�
	static int cnt;

	// instance �ʵ�
	int serialNo;
	// instance �ʱ�ȭ ��
	{
		cnt++; // static �ʵ� ����
		serialNo = cnt; // ������ static �ʵ尪�� ��ü ������ �� �ν��Ͻ� ������ ����
	}

	// instance method
	void print() {
		System.out.println("��ǰ ��ȣ : " + serialNo);
	}
}