package Today0930af;

public class UseclaExam {

	public static void main(String[] args) {
		// ��ü ����
		Calculator cal = new Calculator();
		cal.getCalc("user", "+", 10, 20);
		// �ܺο��� ���� ����
		System.out.println(cal.model);
		System.out.println(cal.result);
		cal.result = cal.sub(10, 20);
		System.out.println(cal.result);
		// �ܺο��� ���� �Ұ�
		// cal.model = "99999";
		System.out.println(cal.model);
	}

}
