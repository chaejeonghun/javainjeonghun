package verify;

public class A {
	public static void main(String[] args) {
		B b = new B();
		b.method1();
	}

	public void method1() {
		System.out.println("부모메소드");
	}

}

class B extends A {

	@Override
	public void method1() {
		System.out.println("자식메소드");
	}

}
