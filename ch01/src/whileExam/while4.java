package whileExam;

import java.io.IOException;

public class while4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2~9사이의 숫자를 입력하세요");
		// 키보드로 숫자 0 을 누르면 입력되는 값은 ?

		try {
			int num = System.in.read() - '0';
			System.out.println("구구단" + num + "단");
			if (num >= 2 && num <= 9) {

				int i = 1;
				while (i <= 9) {
					System.out.println(num + "*" + i + "=" + (i * num));
					i++;
				}
			} else {
				System.out.println("2~9 까지의 숫자만 입력하세요 !!");
			}
		} catch (IOException e) {
			System.out.println("오류발생");
		}

	}

}
