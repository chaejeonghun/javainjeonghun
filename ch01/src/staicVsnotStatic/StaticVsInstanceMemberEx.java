package staicVsnotStatic;

public class StaticVsInstanceMemberEx {

	public static void main(String[] args) {
		int a = 10; // ���ú��� - main
	}

}

class A1 {
	// �ν��Ͻ� �ʵ�� �޼ҵ�
	int field1; // �տ� static�� �����Ͽ� �ٲܼ� �ִ� ����� �ִ�.

	void method1() {
	} // �տ� static�� �����Ͽ� �ٲܼ� �ִ� ����� �ִ�.

	// ���� �ʵ�� �޼ҵ�
	static int field2;

	static void method2() {
	}

	// �ν��Ͻ� �޼ҵ忡�� ���� Ŭ�������� static���, instance ��� ��� ���ٰ���
	void method4() {
		field1 = 0; // instance �ʵ�
		field2 = 10; // static �ʵ�
		method1(); // instance �ʵ�
		method2(); // static �ʵ�
	}

	// static �޼ҵ� ������ instance �ʵ�� ����� �Ұ��մϴ�.
	// static���� ����� ���(�ʵ�, �޼ҵ�)�� ��� �����մϴ�.
	static void method3() {
		// field1=0; // instance �ʵ� - ��� �Ұ�
		// this.field1 = 10; //this Ű���� ���Ұ�
		field2 = 10; // static �ʵ�
		// method1(); // instance �ʵ� -��� �Ұ�
		// this.method1(); //this Ű���� ���Ұ�
		method2(); // static �ʵ�

	}
}