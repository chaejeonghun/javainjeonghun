package Object_isNull;

import java.util.Objects;

public class NullEx {

	public static void main(String[] args) {
		String s1 = "홍길동";
		String s2 = null;

		System.out.println(Objects.requireNonNull(s1));
		// System.out.println(Objects.requireNonNull(s2)); // 예외 발생

		// null여부 확인
		System.out.println(Objects.isNull(s1));
		System.out.println(Objects.isNull(s2));

		// 메시지 출력
		// System.out.println(Objects.requireNonNull(s2, "이름이 없음"));

		System.out.println(Objects.toString(s1));
		System.out.println(Objects.toString(s2));
		System.out.println(Objects.toString(s2, "이름이 없습니다."));

	}

}
