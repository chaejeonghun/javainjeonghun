package ch05;

public class OperatorExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v1 = 5;
		int v2 = 2;
		System.out.println(v1 + v2);
		System.out.println(v1 - v2);
		System.out.println(v1 * v2);

		// 정수/정수 -> 정수의 몫으로 계산
		System.out.println(v1 / v2);
		// 정수/실수 -> 실수
		System.out.println(v1 / (double) v2);

		// 나머지 계산 -> 정수%정수 -> 정수타입의 나머지 계산
		System.out.println(v1 % v2); // 5 = 2*2(몫) +1(나머지)
	}

}
