package whileExam;

public class NoscanneronlyDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 초기값
		int i = 1, j = 2;
		// 중첩 do~ while 문으로 구구단 출력;
		do {
			do {
				System.out.println(j + "*" + i + "=" + (i * j) + "\t");
				j++; // 증가
			} while (j <= 9);
			i++; // 증가
			j = 2; // 초기화
			System.out.println();
		} while (i <= 9);

	}

}
