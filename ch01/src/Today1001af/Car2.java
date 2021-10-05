package Today1001af;

//클래스 멤버 - 필드, 생성자, 메소드
public class Car2 {
	// 메소드
	int gas;

//리턴 타입 없는 메소드
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas잔량 : " + gas + ")");
				gas--;
			} else {
				System.out.println("멈춥니다.(gas잔량 : " + gas + ")");
				return; // 메소드 종료
			}
		}
	}
}
