package Today1005;

public class Calc01Main {

	public static void main(String[] args) {
		// 객체 생성
		// 1
		Calc01 cal = new Calc01();
		int res1 = cal.add(10, 20);
		System.out.println(res1);

		// 2
		cal.i = 10;
		cal.j = 20; // 값의 초기화가 필요
		int res2 = cal.divid();
		System.out.println(res2);

		// 3
		cal.sub(10, 20);

		// 4
		cal.mul();
	}

}
