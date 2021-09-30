package array2;

import java.io.IOException;
import java.util.Scanner;

public class ArrayExam4 {

	public static void main(String[] args) throws IOException {
		// 성적표 프로그램
		// 스캐너로 값 입력받기 int[]score ={76, 45, 34, 89, 100, 50, 90, 92};
		// 입력이 끝나면 합계, 평균 출력하기
		// for문과 향상된 for문으로 출력하기
		// 1.성적입력 | 2.통계(합/평균)출력 | 3. 성적순 출력하기 | 4.종료
		int[] scores = new int[8];
		int a = scores.length;
		Scanner scanner = new Scanner(System.in);

		boolean run = true;

		int keycode = 0;

		while (run) {
			if (keycode != 13 && keycode != 10) {

				System.out.println("1.성적입력 | 2.통계(합/평균)출력 | 3.성적순 출력하기 | 4.종료");
				System.out.println("--------------");

			}
			keycode = System.in.read();
			if (keycode == 49) {
				System.out.println("선택 > 1. 성적입력");
				for (int i = 0; i < a; i++) {
					System.out.print("성적 입력 입력하세요");
					scores[i] = scanner.nextInt();
				}
				for (int i = 0; i < a; i++) {
					System.out.print("성적 :" + scores[i]);
				}
				System.out.println();
			} else if (keycode == 50) {
				System.out.println("선택 > 2. 통계(합/평균)출력");
				int total = 0;
				for (int j = 0; j < scores.length; j++) {
					total += scores[j];

				}
				System.out.println("합계 : " + total);
				double avg;
				avg = total / (double) scores.length;
				System.out.println("평균: " + avg);
				System.out.println();

			} else if (keycode == 51) {
				System.out.println("선택 > 3. 성적순 출력");
				int temp = 0;
				for (int i = 0; i < scores.length; i++) {
					for (int j = i + 1; j < scores.length; j++) {
						if (scores[i] > scores[j]) {
							temp = scores[i];
							scores[i] = scores[j];
							scores[j] = temp;

						}

					}

					System.out.print(scores[i] + "\t");

				}
				System.out.println();
				for (int i = 0; i < scores.length; i++) {
					for (int j = i + 1; j < scores.length; j++) {
						if (scores[i] < scores[j]) {
							temp = scores[i];
							scores[i] = scores[j];
							scores[j] = temp;
						}
					}
					System.out.print(scores[i] + "\t");
				}
				System.out.println();

			} else if (keycode == 52) {
				System.out.println("프로그램 종료");

			}

		}
	}
}