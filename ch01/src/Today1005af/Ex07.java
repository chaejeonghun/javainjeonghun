package Today1005af;

public class Ex07 {

	public static void main(String[] args) {
		G1 g = new G1();
		for (int i = 0; i < 10; i++) {
			String str = g.method(); // 호출
			System.out.println(str);
		}
	}

}

class G1 {
	// 2유형 - 매개변수 x 리턴타입 o
	String method() {
		return "대박";
	}
}
