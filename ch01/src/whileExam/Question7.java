package whileExam;

import java.io.IOException;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean run = true;

		int keycode = 0;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			if (keycode != 13 && keycode != 10) {
				System.out.println("--------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("--------------");

			}
			keycode = System.in.read();
			if (keycode == 49) {
				System.out.println("선택 > 1");
				System.out.print("예금액 > 10000");
			} else if (keycode == 50) {
				System.out.println("선택 > 2");
				System.out.println("출금액 > 2000");
			} else if (keycode == 51) {
				System.out.println("선택 > 3");
				System.out.println("잔고 > 8000");
			} else if (keycode == 52) {
				System.out.println("프로그램 종료");

			}

		}

	}

}
