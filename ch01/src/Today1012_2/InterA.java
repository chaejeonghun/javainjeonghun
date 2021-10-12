package Today1012_2;

public interface InterA {
	// 추상 메소드
	void method();
}

//추상메소드를 포함하는 추상클래스
abstract class A implements InterA {
	// 추상메소드로 선언(추상메소드로 재정의)
	public abstract void method();
}

//추상클래스를 상송받은 실체 클래스
class B extends A {
	@Override
	public void method() {
		// 실행부
	}
}