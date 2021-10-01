package Today0930af;

public class UseclaExam {

	public static void main(String[] args) {
		// 객체 생성
		Calculator cal = new Calculator();
		cal.getCalc("user", "+", 10, 20);
		// 외부에서 접근 가능
		System.out.println(cal.model);
		System.out.println(cal.result);
		cal.result = cal.sub(10, 20);
		System.out.println(cal.result);
		// 외부에서 수정 불가
		// cal.model = "99999";
		System.out.println(cal.model);
	}

}
