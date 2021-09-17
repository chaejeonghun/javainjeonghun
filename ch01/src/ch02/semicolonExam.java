package ch02;

public class semicolonExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1; // 변수 x를 선언하고 정수 1을 저장 - 변수 선언과 동시에 값 저장
		// int x; x=1; //변수를 먼저 선언 후에 값을 저장

		int y = 2; // 변수 y를 선언하고 정수 2를 저장
		// int y; y=2; //변수를 먼저 선언 후에 값을 저장

		int result = x + y; // 변수 result를 선언하고 변수 x에 저장된 값과 y에 저장된 값의 합을 저장

		// 출력 기능의 라이브러리를 제공함 = println()함수(메소드)
		System.out.println(result); // 콘솔에 출력하는 메소드 호출
	}
}
