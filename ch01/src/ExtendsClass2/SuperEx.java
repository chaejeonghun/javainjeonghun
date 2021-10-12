package ExtendsClass2;

public class SuperEx {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showColorPoint();
	}

}

class Point {
	private int x, y; // 한 점을 구성하는 x, y 좌표, private로 상속 제외

	public Point() {
		this.x = this.y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() { // 점의 좌표 출력
		System.out.println("(" + x + ", " + y + ")");
	}
}

class ColorPoint extends Point {
	// 추가 필드
	private String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y); // Point의 생성자 x, y표시
		this.color = color;
	}

	// 추가 메소드
	public void setColor(String color) {
		this.color = color;
	}

	public void showColorPoint() { // 컬러점의 좌표 출력
		System.out.println(color);
		// System.out.println("("+x+", "+y+")"); - 상속에서 제외되어 상속x
		showPoint(); // point클래스의 showPoint() 호출
	}
}