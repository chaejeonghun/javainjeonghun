package Todaywork;

public class work0929plus {

	public static void main(String[] args) {
		// 기본 타입의 값 비교
		int a = 10;
		int b = 10;
		System.out.println(a == b ? "정수타입 변수 a와 정수타입 변수 b의 값이 같다." : "정수타입 변수 a와 정수타입 변수 b의 값이 다르다.");
		System.out.println(a != b ? "정수타입 변수 a와 정수타입 변수 b의 값이 다르다." : "정수타입 변수 a와 정수타입 변수 b의 값이 같다.");

		// 참조타입 값 비교
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1 == str2 ? "str1과 str2의 내용이 같다." : "str1과 str2의 내용이 다르다.");
		// 1. "str1과 str2의 참조주소가 같다.":"str1과 str2의 참조추소가 다르다."
		// System.out.println(str1.equals(str2)?
		// "str1과 str2의 내용이 논리적 동등":"str1과 str2의 내용이 논리적 동등x");

	}

}
