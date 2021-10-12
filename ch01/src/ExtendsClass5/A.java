package ExtendsClass5;

public class A {
	public static void main(String[] args) {
		B b;
		b = new B(5);

	}

	public A() {
		System.out.println("생성자 A");
	}

	public A(int X) {
		System.out.println("생성자" + X);
	}

}

class B extends A {
	// default생성자
	public B() {
		super(5); // 부모클래스의 생성자 중에 int 타입의 매개변수 있는 생성자 선택 호출
		System.out.println("생성자 B");
	}

	// super() 메소드로 부모클래스의 매개변수 있는 생성자 호출 가능
	public B(int X) {
		super(X);
		System.out.println("매개변수생성자");
	}
}
