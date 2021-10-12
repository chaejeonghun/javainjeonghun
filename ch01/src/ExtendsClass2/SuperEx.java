package ExtendsClass2;

public class SuperEx {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showColorPoint();
	}

}

class Point {
	private int x, y; // �� ���� �����ϴ� x, y ��ǥ, private�� ��� ����

	public Point() {
		this.x = this.y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() { // ���� ��ǥ ���
		System.out.println("(" + x + ", " + y + ")");
	}
}

class ColorPoint extends Point {
	// �߰� �ʵ�
	private String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y); // Point�� ������ x, yǥ��
		this.color = color;
	}

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