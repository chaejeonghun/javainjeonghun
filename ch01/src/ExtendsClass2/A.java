package ExtendsClass2;

public class A {

	public static void main(String[] args) {
		B b;
		b = new B();
	}

	public A() {
		System.out.println("������ A");
	}

	public A(int X) {
		System.out.println("������" + X);
	}

}

class B extends A {
	// default������
	public B() {
		System.out.println("������ B");
	}
}
