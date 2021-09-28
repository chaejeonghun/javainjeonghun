package ArrayPractice;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int s1 = 10; int s2 = 15; int s3 = 5; int s4 = 7; int s5 = 8; int s6 = 3; int
		 * s7 = 9; int s8 = 10; int s9 = 5; int s10 = 4;
		 */
		// 배열 선언
		// 타입 변수명 [] = {초기값 1, 초기값 2, ....};
		// 타입 [] 변수 명 = new 타입[저장할 요수 갯수];
		// int[] scores = new int[10];

		// 동일 타입의 값이 순서대로 연속해서 저장됨.
		// 배열의 index 시작은 0부터
		int[] scores = new int[10];
		scores[0] = 10;
		scores[1] = 15;
		scores[2] = 5;
		scores[3] = 7;
		scores[4] = 8;
		scores[5] = 3;
		scores[6] = 9;
		scores[7] = 10;
		scores[8] = 5;
		scores[9] = 4;

		// 배열 참조변수명.length = 배열의 길이 (저장 가능 공간 개수)
		// 배열 참조변수명 .length는 일기 전용 변수, 배열 생성시 자동으로 배열의 길이값으로 초기화

		System.out.println(scores.length);
		// scores.length=20;
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			sum = sum + scores[i]; // 배열의 저장된 요소 접근 - 배열변수명[idnex 번호]
		}

		double avg = sum / (double) 10;
		System.out.println("avg:" + avg);

	}

}
