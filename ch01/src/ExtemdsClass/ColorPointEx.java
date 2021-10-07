package ExtemdsClass;

public class ColorPointEx {

	public static void main(String[] args) {
		Point p = new Point(); // Point 객체 생성
		p.set(1, 2);
		p.showPoint();

		ColorPoint cp = new ColorPoint();
		cp.set(3, 4); // 상속 받은 메소드에 접근
		cp.setColor("red"); // 자식클래스에서 추가된 메소드
		cp.showColorPoint();// 자식클래스에서 추가된 메소드에서 부모클래스의
							// 메소드 호출을 통한 private필드 접근.
	}

}

class Point {
	private int x, y; // 한 점을 구성하는 x, y 좌표, private로 상속 제외

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
}

class ColorPoint extends Point {
	// 추가 필드
	private String color;

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

class ColorPoint2 {
	private int x, y; // 한 점을 구성하는 x, y 좌표, private로 상속 제외

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}

	// 추가 필드
	private String color;

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