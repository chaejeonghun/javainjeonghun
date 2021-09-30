package Todaywork;

import java.util.Scanner;

public class work0929Answer {

	public static void main(String[] args) {
		int cnt = 0;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			String id, pw;
			if (cnt == 5) {
				System.out.println(cnt + " 회 실패 하였습니다. 프로그램을 종료합니다");
				break;
			}
			System.out.println("아이디와 패스워드를 입력하세요.");
			System.out.println("아이디 >");
			id = scanner.next();
			System.out.println("패스워드 >");
			pw = scanner.next();

			System.out.println();
			if ("hong".equals(id) && "1234".equals(pw)) {
				System.out.println("로그인 성공");
				break;
			}
			cnt++;
			if (cnt != 5)
				System.out.println(++cnt + "회 실패 하였습니다.");
		}
		System.out.println("프로그램 종료");
	}
}