package ch07;

public class AssignmentIncdecOperatorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 3, b = 3, c = 3;

		a += 3; // a= a+3 = 6; // a = 6
		b *= 3; // b= b*3 = 9; // b = 9
		c %= 2; // c= c%3 = 1; // c = 1

		// 자바 언어로 개발시 여러개의 매개변수로 만들지 않아서
		// System.out.println(a,b,c); 불가능

		System.out.println("a=" + a + ",b=" + b + ",c=" + c);
		// 출력 결과 "a = 6, b = 9, c = 1"
		// "a=" +6 => "a="+"6" => "a=6","a=6"+" , c=" => "a=6,b="+"9" =>
		// "a=6,b=9,c=" + "1" => "a=6,b=9,c=1"

		int d = 3;
		// 증감 연산자 사례
		// ++, -- 가 변수 앞에 있으면 증/감 후 연산처리
		// ++, -- 가 변수 뒤에 있으면 연산처리 후 증/감

		a = d++; // a= 3, d = 4
		System.out.println("a=" + a + ",d=" + d);
		a = ++d; // a= 5, d = 5
		System.out.println("a=" + a + ",d=" + d);
		a = d--; // a = 5, d = 4
		System.out.println("a=" + a + ",d=" + d);
		a = --d; // a = 3, d = 3
		System.out.println("a=" + a + ",d=" + d);

	}

}
