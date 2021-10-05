package Today1005;

public class MethodMainExam {

	public static void main(String[] args) {
		// 메소드를 내장하고 있는 클래스의 객체 생성
		MethodExam m = new MethodExam();
		// 참조변수의 메소드 접근
		// 1. 유형(매개변수 o, 리턴타입o)
		// 첫 번째 정수, 두 번째 정수를 받아서 연산후 결과를
		// int타입으로 되돌려 줌.
		int result = m.sum(10, 10); // 호출시 실제값 매개변수로 전달
		System.out.println(result);

		// 2.유형(매개변수 x, 리턴타입 o)
		String str1 = m.greeting();
		System.out.println(str1);

		// 3.유형 (매개변수 o, 리턴타입 x)
		// void로 형성된 메소드는 값을 받을수 없음
		m.sumVoid(10, 30);

		// 4.유형 (매개변수 x, 리턴타입 x)
		// void로 형성된 메소드는 값을 받을수 없음
		m.greetingVoid();

	}

}
