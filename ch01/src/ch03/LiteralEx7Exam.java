package ch03;

/* 자바 7 이후의 예외적인 리터럴 초기화*/
public class LiteralEx7Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 20_100;
		long cardNumber = 1234_5678_1357_9998L;
		long controlBits = 0b10110100_01011011_10110011_11111000;
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		int age = 2____5;

		// int x = 15_; //오류 리터럴 끝에 사용 x
		// double pi = 3_.14 // 오류 소수점 앞뒤에 사용 x
		// long idnum = 981231_1234567_L; // L(F) 앞에 사용 X
		// int y = 0_x15; //0x 중가닝나 앞뒤 사용 x
	}

}
