package ExtemdsClass;

public class ColorPointEx {

	public static void main(String[] args) {
		Point p = new Point(); // Point ��ü ����
		p.set(1, 2);
		p.showPoint();

		ColorPoint cp = new ColorPoint();
		cp.set(3, 4); // ��� ���� �޼ҵ忡 ����
		cp.setColor("red"); // �ڽ�Ŭ�������� �߰��� �޼ҵ�
		cp.showColorPoint();// �ڽ�Ŭ�������� �߰��� �޼ҵ忡�� �θ�Ŭ������
							// �޼ҵ� ȣ���� ���� private�ʵ� ����.
	}

}

class Point {
	private int x, y; // �� ���� �����ϴ� x, y ��ǥ, private�� ��� ����

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
}

class ColorPoint extends Point {
	// �߰� �ʵ�
	private String color;

	// �߰� �޼ҵ�
	public void setColor(String color) {
		this.color = color;
	}

	public void showColorPoint() { // �÷����� ��ǥ ���
		System.out.println(color);
		// System.out.println("("+x+", "+y+")"); - ��ӿ��� ���ܵǾ� ���x
		showPoint(); // pointŬ������ showPoint() ȣ��
	}
}

class ColorPoint2 {
	private int x, y; // �� ���� �����ϴ� x, y ��ǥ, private�� ��� ����

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}

	// �߰� �ʵ�
	private String color;

	// �߰� �޼ҵ�
	public void setColor(String color) {
		this.color = color;
	}

	public void showColorPoint() { // �÷����� ��ǥ ���
		System.out.println(color);
		// System.out.println("("+x+", "+y+")"); - ��ӿ��� ���ܵǾ� ���x
		showPoint(); // pointŬ������ showPoint() ȣ��
	}
}