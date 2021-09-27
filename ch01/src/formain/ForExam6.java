package formain;

public class ForExam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for(초기화; for 블럭을 빠져나가는 조건; 증감){실행문;}
		for (int i = 1, y = 1; i < 10; i++, System.out.println(y)) { // for 블럭을 빠져나가는 조건이 true
			// true가 없는 경우도 조건을 true로 간주
			System.out.println("hello");
			// for 블럭을 빠져나가는 조건을 블럭내에서 처리{}
			if (i == 10)
				break;
			y++;
		}
		// System.out.println("종료");
	}

}
