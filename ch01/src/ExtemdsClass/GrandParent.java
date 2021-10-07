package ExtemdsClass;

//생성자는 상속에서 제외됨.
public class GrandParent {

	public GrandParent() {
		System.out.println("최상위 부모생성자는 가장 나중에 호출되지만, 실행은 가장 먼저 된다.");
	}

}

//상속된 클래스의 컴파일시 자식생성자에 super()메소드가 자동 추가됨.
class Parent extends GrandParent {

	public Parent() {
		// super();
		System.out.println("하위클래스로 부터 호출된 후 상위클래스를 호출, 최상위클래스 실행 후 실행");
	}

}

class Child extends Parent {

	public Child() {
		// super();
		System.out.println("가장 먼저 호출되지만, 상위 클래스 실행후 실행된다.");
	}

}