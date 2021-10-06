package Today1006Mor;

public class Init3Ex {

	public static void main(String[] args) {
		System.out.println("초기화 테스트");
		Block b1 = new Block();
		Block b2 = new Block();
		Block b3 = new Block();

	}

}

//실행순서 - > static 초기화 -> 인스턴스 초기화 -> 생성자 ->( 인스턴스 초기화 -> 생성자)....반복
class Block {
	{
		System.out.println("인스턴스 초기화 블럭");
	}
	// static의 특성 - unique특성 : 최초 클래스로 로드시 한번만 실행.
	static {
		System.out.println("static 초기화 블럭");
	}

	Block() {
		System.out.println("생성자");
	}
}
