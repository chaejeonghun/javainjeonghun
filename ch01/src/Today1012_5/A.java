package Today1012_5;

public class A {

	static class B {
		B() {
		}

		int field1;

		// static int field2;
		void method1() {
		}
		// static void method2() {}

	}

	static class C {
		C() {
		}

		int field1;
		static int fiedl2;

		void method1() {
		}

		static void method2() {
		}

	}

	void method() {
		class D {
			D() {
				System.out.println("����Ŭ���� ������");
			}

			int field1;

			// static int field2;
			void method1() {
				System.out.println("���� Ŭ���� D�� �޼ҵ�");
			}
			// static void method2(){}

		}
		D d = new D();
		d.field1 = 3;
		d.method1();

		class E {
			E() {
				System.out.println("����Ŭ���� ������");
			}

			int field1;

			// static int field2;
			void method1() {
				System.out.println("���� Ŭ���� E�� �޼ҵ�");
			}
			// static void method2(){}

		}
		E e = new E();
		e.field1 = 3;
		e.method1();
	}

}
