package ArrayPractice;

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 선언
		// 타입 변수명[];
		// 변수명 = new 타입[]{초기값1, 초기값2, ....};

		// 타입 []변수 = new 타입[길이];
		// 타입[] 변수 = null;
		// 변수 = new타입[길이];
		int scores[];
		scores = new int[] { 10, 15, 5, 7, 8, 3, 9, 10, 5, 4 };
		System.out.println(scores.length);
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			sum = sum + scores[i]; // 배열의 저장된 요소 접근 - 배열변수명[idnex 번호]
		}

		double avg = sum / (double) 10;
		System.out.println("avg:" + avg);

	}

}
