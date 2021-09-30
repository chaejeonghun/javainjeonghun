package ArrayPractice;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = { 76, 45, 34, 89, 100, 50, 90, 92 };
		int temp = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] > score[j]) { // i의 값이 크면 j의 값과 교환
					temp = score[i]; // i의 값을 임시변수에 저장
					score[i] = score[j]; // j의 값을 i에 저장 후
					score[j] = temp; // 임시 저장한 값을 다시 j에 저장

				}

			}
		}
		System.out.println();
		// 정렬된 내용 출력
		for (int i : score) {
			System.out.print(i + "   ");
		}
	}

}
