package Today1005af;

public class Ex03 {

	public static void main(String[] args) {
		C1 c = new C1();
		c.cal1(10, 20);
		int result = c.cal2(2, 2);
		System.out.println(result);

	}

}

class C1 {
	// 매개변수 o, 리턴타입 x - 3 유형
	void cal1(int x, int y) {
		System.out.printf("%d + %d = %d\n", x, y, x + y);
		System.out.printf("%d - %d = %d\n", x, y, x - y);
		System.out.printf("%d * %d = %d\n", x, y, x * y);
		System.out.printf("%d / %d = %d\n", x, y, x / y);
	}

	// 매개변수 o, 리턴타입 o - 1 유형
	int cal2(int x, int y) {
		return x * y;
	}

}