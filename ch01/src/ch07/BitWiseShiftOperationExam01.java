package ch07;

public class BitWiseShiftOperationExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// <<왼쪽 shift 연산 후 오른쪽 공백은 0 으로채움.
		byte a = 5;
		byte b = (byte) (a << 2); // byte, short, char는 연산시 int로 변환 후 연산에 참여
		System.out.println(b);

		// 오른쪽 shift(>>)는 최상위 비트를 왼쪽에 채움.
		// int 타입의 값은 양수이면 최상위 비트가 0,
		// 음수이면 최상위 비트가 1이다.
		a = 20;
		b = (byte) (a >> 2); // byte, short, char는 연산시 int로 변환 후 연산에 참여함.
		System.out.println(b);

		// 오른쪽 shift(>>) 2개 짜리 연산시 값이 음수면 최상위 비트가 1이므로
		// 왼쪽에서 1이 채워짐
		byte c = (byte) 0xf8; // -8
		byte d = (byte) (c >> 2); // -2 = -8/2 => -4/2 = -2
		System.out.println(c); // shift 이전의 값
		System.out.println(d); // shift 이후의 값

		// 오른쪽 shift(>>>) 3개 짜리는 연산시 왼쪽에 무조건 0으로 채움.
		byte e = 20;
		byte f = (byte) (e >>> 2);
		System.out.println(f);

	}

}
