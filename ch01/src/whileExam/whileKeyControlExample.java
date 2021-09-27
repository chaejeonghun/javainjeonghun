package whileExam;

import java.util.Scanner;

public class whileKeyControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("------------");
				System.out.println("1.증속 | 2. 감속 | 3. 중지 :");
				System.out.println("------------");
				System.out.println("선택 : ");

			}

			// '0'의 int 값은 48 49-48=1, 50-48=2, 51-48=3
			keyCode = scanner.nextInt();

			if (keyCode == 49) { // "1"
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if (keyCode == 50) { // "2"
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if (keyCode == 51) { // "3"
				run = false;
			}
		} // while 끝
		System.out.println("종료");

	}

}
