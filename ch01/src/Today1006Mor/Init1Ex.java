package Today1006Mor;

public class Init1Ex {

	public static void main(String[] args) {
		// 로컬 변수 i1 선언
		Init1 i1 = new Init1();
		int[] b = i1.a; // i1 객체의 배열 정보를 b가 받음.(얕은 복사)
		for (int i : i1.a) {
			System.out.println(i);
		}
	}

}

class Init1 {
	// 필드
	int[] a = new int[5];
	// 초기화 블럭 instance {초기화 내용}
	{
		for (int i = 0; i < a.length; i++) {
			int k = (int) (Math.random() * 10);
			a[i] = k;
		}
	}
}
