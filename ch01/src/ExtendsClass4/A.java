package ExtendsClass4;

public class A {
	public static void main(String[] args) {
		B b;
		b = new B(5);
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

	// super() �޼ҵ�� �θ�Ŭ������ �Ű����� �ִ� ������ ȣ�� ����
	public B(int X) {
		super(X);
		System.out.println("�Ű�����������");
	}
}
