package Today1012_3;

//자바는 클래스와 인터페이를 부모로
//클래스에 다중 상속을 대신할 수 있다.
public class Bird extends Animal implements RunInterface {
	@Override
	public void run() {

	}
	// name 필드 존재
	// eat() 메소드 존재

}

//run() <- Bird에 적용