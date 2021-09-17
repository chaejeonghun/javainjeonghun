package ch03;

public class identifierExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수선언
		// String @myname = "홍길동"; - 특수문자 @로 시작시 에러
		// int #no = 27; - 특수문자 # 시작시 에러
		// int !age = 30; - 특수문자 ! 시작시 에러

		String _myname = "일지매"; // 정상 - 참조타입
		int $money = 1000; // 정상 $변수명 - 기본타입

		// int 1stJob = 1; 숫자로 시작되는 변수 에러
		int job1st = 1; // 정상
		// int my count = 10; -my 와 count 사이 공백 에러
		// int your turn = 2; - your와 turn 사이에 tab만큼의 공백 에러

		// 길이에 제한 없음
		// 변수명은 소문자로 시작
		// 단어와 단어가 합쳐진 합성어의 경우 합쳐지는 뒷 단어의 첫글자는 대문자로 표시
		// 카멜 표기법
		String myCountryNameAndMycityNameAndMydongis = "대한민국의정부용현";

		// 변수 선언
		// 타입 변수명(식별자) = 값;
		// int true = "참"; -true/false 는 식별자로 사용이 불가하다.
		// boolean false = "거짓"; -true/false 는 식별자로 사용이 불가하다.

		// String null = "아무것도 없다"; -null은 식별자로 사용이 불가하다.

		// 변수(식별자)는 대소문자를 구분함 Test와 test는 다른 변수임.
		int Test = 10;
		int test = 20;

	}

}
