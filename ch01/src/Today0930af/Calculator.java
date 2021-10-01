package Today0930af;

//public 키워드는 외부에서 접근 가능한 접근 제어자임.
public class Calculator {
	// 모델명은 수정되면 안됨
	public final String model = "00001";
	// result 값은 getCalc에 의해서 처리된 값만 받음.
	// public을 private로 변경시 외부에서 해당 클래스에 접근이 불가능하다.
	public double result = 0;
	// 같은 클래스내의 메소드 들끼리는 상호 호출가능
	public String resultNumber = "";

	public void getCalc(String user, String op, int x, int y) {
		if (user.equals("admin")) {
			resultNumber = "99999";
			resultNumber = "00000";
		}
		switch (op) {
		case "+":
			result = add(x, y);
			System.out.println(result);
			break;

		case "-":
			result = sub(x, y);
			System.out.println(result);
			break;

		case "X":
			result = mul(x, y);
			System.out.println(result);
			break;

		case "/":
			result = div(x, y);
			System.out.println(result);
			break;
		}
		System.out.println(resultNumber);
	}

	// public을 private로 변경시 외부에서 해당 클래스에 접근이 불가능하다.
	// 아래의 메소드 들은 getCalc()메소드만 호출가능 - 외부에서 호출불가
	public int add(int x, int y) {
		return x + y;
	}

	public int sub(int x, int y) {
		return x - y;
	}

	public int mul(int x, int y) {
		return x * y;
	}

	public double div(int x, int y) {
		return x / (double) y;
	}
}
