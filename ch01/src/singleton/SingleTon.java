package singleton;

//싱클 톤으로 클래스 선언
public class SingleTon {
//1. 자신타입의 static 필드선언
	private static SingleTon instance = new SingleTon();

//2. 생성자를 외부에서 접근 못하게 private 처리
	private SingleTon() {
	}

//3. public 메소드로 접근하도록 메소드 선언
	public static SingleTon getInstance() {
		if (instance == null)
			instance = new SingleTon();
		return instance;
	}

}