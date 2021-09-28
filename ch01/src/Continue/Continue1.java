package Continue;

public class Continue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) { // 홀수면 출력하지 않기 - 홀수만 출력
				continue; // for 문이면 i++ 문으로 바로 이동,
							// 아래 print 문은 실행 x
			}
			System.out.println(i);
		}

	}

}
