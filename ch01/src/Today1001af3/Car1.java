package Today1001af3;

public class Car1 {

	// �ʵ�
	String model;
	String color;
	int maxSpeed;

	// ������
	Car1() {
	}

	// ���� Ŭ���������� �ٸ� ������ ȣ���
	// this()�޼ҵ�� ȣ��
	// #���ǻ��� - �ݵ�� ȣ���ϴ� �������� ù ���ο� ���� �ؾ���.
	Car1(String model) {
		this.model = model;
	}

	Car1(String model, String color) {
		// Car1(model);
		this(model);
		this.color = color;
	} // String, String

	Car1(String model, String color, int maxSpeed) {
		// Car1(model,color);
		this(model, color);
		this.maxSpeed = maxSpeed;
	} // String, String, int
}
