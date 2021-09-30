package Todaywork;

import java.util.Scanner;

public class work0929 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// 1.id ="hong", pw = "1234
		// id 와 pw를 scanner로 입력 받아서 id와 pw가 둘다 같으면 " login 성공",
		// 아니면 "1회 실패하였습니다." 출력
		// 5회 실패하면, "5회 실패하였습니다. 프로그램을 종료합니다 " 출력 후 종료
		int cnt = 0;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			String id, pw;
			System.out.println("아이디와 패스워드를 입력하세요.");
			System.out.println("아이디 >");
			id = scanner.next();
			System.out.println("패스워드 >");
			pw = scanner.next();
			if (id != "hong" || pw != "1234") {

				System.out.println(cnt++ + "회 실패하였습니다.");

			}
			if (cnt == 5) {
				System.out.println(cnt + " 회 실패 하였습니다. 프로그램을 종료합니다");
				break;
			}

			System.out.println();
			if ("hong".equals(id) && "1234".equals(pw)) {
				System.out.println("로그인 성공");
				break;
			}

		}
	}
}
