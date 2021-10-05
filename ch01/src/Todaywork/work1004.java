package Todaywork;

/*과제 제출기한 10/4일 23:59까지 
 * 스캐너로 입력값 입력 받기 성별, 나이, 키, 몸무게 
 * 반복처리 가능하게 만들고 
 * 계속 여부 출력후 yes/no 값을 받아서 종료하도록 수정하기
 * */
import java.util.Scanner;

public class work1004 {

	public static void main(String[] args) {
		String[] strArray = new String[4];
		// TODO Auto-generated method stub
		// 체지방량 계산공식
		// 체지방률 = 몸무게 - 체지방량;
		// 남성표준 체지방량 - (1.10*체중) - (128*(체중kg^2/키 cm^2)
		// 체중 75 kg 키 175cm 인 남성의 표준 체지방량은 얼마일까요 ?
		Scanner scanner = new Scanner(System.in);

		final double a = 1.10;
		final int b = 128;
		boolean run = true;
		int sum = 0;
		String age, height, weight, gender;
		System.out.println("성별?");
		gender = scanner.next();
		System.out.println("나이?");
		age = scanner.next();
		System.out.println("키?");
		height = scanner.next();
		System.out.println("몸무게?");
		weight = scanner.next();

		while (true) {

		}
	}
}
