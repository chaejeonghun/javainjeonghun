package ch07;

/**
 * ��� ����� String Ÿ�԰� ���� �Ҷ��� �ٸ� ����Ÿ Ÿ���� ������ String Ÿ������ �ڵ� �� ��ȯ �Ŀ� ���꿡 ������.
 *
 */
public class OperExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "JDK" + 6.0; // +�� ���տ���, "JDK" + "6.0" = > JDK6.0;
		String str2 = str1 + "Ư¡"; // "JDK6.0" + "Ư¡" -> "JDK6.0Ư¡"
		System.out.println(str2);

		String str3 = "Jdk" + 3 + 3.0; // "JDK" + 3 => "JDK" + "3" = "JDK3", "JDK3" + 3.0 = "JDK3" + "3.0" = "JDK33.0";
		String str4 = 3 + 3.0 + "JDK"; // 3 + 3.0 => 6.0, 6.0 + "JDK" => "6.0" + "JDK" = "6.0JDK"
		System.out.println(str3);
		System.out.println(str4);

	}

}
