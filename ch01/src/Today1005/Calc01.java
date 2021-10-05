package Today1005;

public class Calc01 {
//
	int i = 0, j = 0;

//합 -1유형 (매개변수 o 리턴타입 o)
	public int add(int x, int y) {
		return x + y;
	}

//나누기 - 2유형 (매개변수 x 리턴타입 o)
	public int divid() {
		return i / j;
	}

//빼기 - 3유형 (매개변수 o 리턴타입 x)
	public void sub(int x, int y) {
		System.out.println(x - y);
	}

//곱하기 - 4유형 (매개변수 x 리턴타입 x)
	public void mul() {
		System.out.println(i * j);
	}
}
