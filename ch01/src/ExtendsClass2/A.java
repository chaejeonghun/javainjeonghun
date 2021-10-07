package ExtendsClass2;

public class A {

	public static void main(String[] args) {
		B b;
		b = new B();
	}

	public A() {
		System.out.println("持失切 A");
	}

	public A(int X) {
		System.out.println("持失切" + X);
	}

}

class B extends A {
	// default持失切
	public B() {
		System.out.println("持失切 B");
	}
}
