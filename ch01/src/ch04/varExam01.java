package ch04;

class varExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1;

		if (true) {
			// main 메소드 내의 if 블럭에서 선언된 로컬 변수
			int var2;
			var1 = 1; // main 메소드 내의 if블럭 내에서 사용 가능
			var2 = 2; // 자신이 선언된 블럭 내에서 사용가능
			int result = var1 + var2;
			System.out.println(result);

		}

		while (true) {
			// main메소드내의 while 블럭에서 선언된 로컬 변수
			int var3;
			System.out.println(var1); // main에서 선언되고 if블럭에서 값이 바뀐 변수
			var3 = 3;
			var1 = 4; // while 블러겡서 새로운 값 저장
			System.out.println(var1 + var3);
			// var2= 5; //
			break; // 반복문을 빠져 나가게 하는 명령어
		}

		System.out.println(var1);
		// System.out.println(var2);
		// System.out.println(var3);

	}
}