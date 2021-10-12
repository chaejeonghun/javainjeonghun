package Today1012;

public class InterMain {
	public static void maint(String[] args) {
		InterfaceA ia = new CA();
		ia.methodA();

		InterfaceB ib = new CA();
		ib.methodB();
		// interfaceB에 없는 메소드
		// ib.methodC();
	}
}
