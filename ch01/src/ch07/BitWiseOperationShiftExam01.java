package ch07;

public class BitWiseOperationShiftExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte c = 20; // 0x14
		byte d = -8; // 0xf8

		System.out.println("[시프트 연산 결과]");
		System.out.println(c << 2); // c값을 2비트 왼쪽 시프트
		System.out.println(c >> 2); // c값을 2비트 오른쪽 시프트, 왼쪽 최상위 비트 0 삽입 (양수)
		System.out.println(d >> 2); // d값을 2비트 오른쪽 시프트, 왼쪽 최상위 비트 1 삽입 (음수)

		System.out.printf("%x\n", d); // shift 이전의 값 00 f 8
										// 1111 1000 - >(00삽입)11 1110 (삭제00)
		System.out.printf("%x\n", (d >>> 2)); // d를 2비트 오른쪽 시프트, 왼쪽에 무조건 0이 삽입.
		// 3 f f f f f f e
		// 0011 1111 1111 1111 1111 1111 1111 1110

	}

}
