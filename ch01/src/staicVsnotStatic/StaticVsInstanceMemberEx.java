package staicVsnotStatic;

public class StaticVsInstanceMemberEx {

	public static void main(String[] args) {
		int a = 10; // 로컬변수 - main
	}

}

class A1 {
	// 인스턴스 필드와 메소드
	int field1; // 앞에 static을 주입하여 바꿀수 있는 방식이 있다.

	void method1() {
	} // 앞에 static을 주입하여 바꿀수 있는 방식이 있다.

	// 정적 필드와 메소드
	static int field2;

	static void method2() {
	}

	// 인스턴스 메소드에서 같은 클래스내의 static멤버, instance 멤버 모두 접근가능
	void method4() {
		field1 = 0; // instance 필드
		field2 = 10; // static 필드
		method1(); // instance 필드
		method2(); // static 필드
	}

	// static 메소드 내에서 instance 필드는 사용이 불가합니다.
	// static으로 선언된 멤버(필드, 메소드)만 사용 가능합니다.
	static void method3() {
		// field1=0; // instance 필드 - 사용 불가
		// this.field1 = 10; //this 키워드 사용불가
		field2 = 10; // static 필드
		// method1(); // instance 필드 -사용 불가
		// this.method1(); //this 키워드 사용불가
		method2(); // static 필드

	}
}