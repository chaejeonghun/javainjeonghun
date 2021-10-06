package singleton;

public class Exmain {

	public static void main(String[] args) {
		// multiton 방식 - new 생성자 ();
		// SingleTon s1 = new SingleTon();
		// SingleTon s1 = SingleTon.instance;
		// 클래스명.static 메소드 호출();
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();

		System.out.println(s1 == s2 ? " 같은객체 " : "다른객체");
	}

}
