package ArrayPractice;

public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scores[] = { 10, 15, 5, 7, 8, 3, 9, 10, 5, 4 };
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
